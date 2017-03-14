import scala.util.Random

object Hammurabi {

  var starved = 0             // how many people starved
  var immigrants = 5          // how many people came to the city
  var population = 100
  var harvest = 3000          // total bushels harvested
  var bushelsPerAcre = 3      // amount harvested for each acre planted
  var rats_ate = 200          // bushels destroyed by rats
  var bushelsInStorage = 2800
  var acresOwned = 1000
  var pricePerAcre = 19       // each acre cost this many bushels
  var plagueDeaths = 0
  var pricePerAcrePreviousYear : Int = pricePerAcre //Hammurabi acreMarket
  var startingPopulation : Int = population  //For reports
  var startingAcres : Int = acresOwned      // For reports

  def printIntroductoryMessage (): Unit = {
    println("""Congratulations, you are the newest ruler of ancient Samaria, elected
              |for a ten year term of office. Your duties are to dispense food, direct
              |farming, and buy and sell land as needed to support your people. Watch
              |out for rat infestations and the plague! Grain is the general currency,
              |measured in bushels. The following will help you in your decisions:
              |* Each person needs at least 20 bushels of grain per year to survive.
              |* Each person can farm at most 10 acres of land.
              |* It takes 2 bushels of grain to farm an acre of land.
              |* The market price for land fluctuates yearly.
              |
              |Rule wisely and you will be showered with appreciation at the end of
              |your term. Rule poorly and you will be kicked out of office!
              |""")
  }

  def hammurabi () :Unit = {

    printIntroductoryMessage()


    for(i <- 1 to 10) {


      println(
        s"""O great Hammurabi!
           |You are in year $i of your ten year rule.
           | In the previous year $starved people starved to death.
           | In the previous year $immigrants people entered the kingdom.
           | The population is now $population.
           | We harvested $harvest bushels at $bushelsPerAcre bushels per acre.
           | Rats destroyed $rats_ate bushels, leaving $bushelsInStorage bushels in storage.
           | The city owns $acresOwned acres of land.
           | Land is currently worth $pricePerAcre bushels pre acre.
           | There were $plagueDeaths from the plague.
         """.stripMargin)


      acresOwned += whatDoYouWantToDoWithYourLand()
      if(hammurabiFailedAllHisPeople(howMuchGrainForThePeople())){
        println("You are the worst Hammurabi ever. Get out from our city")
        return
      }
      plague()
      harvestResults(howManyAcresToPlant())
      ratProblems()
      landCost()
      howManyCameToTheCity()


    }


  }
  //Hammurabi's choices
  def howManyAcresToPlant(): Int = {
    readInt(s"O great Hammurabi we currently own $acresOwned acres.\n" +
      s"How many of them do you want us to plant with seed?\n")

  }

  def howMuchGrainForThePeople(): Int = {
    var food =readInt("O great Hammurabi each person needs at least 20 bushels of grain per year to survive.\n" +
      s"We currently have $bushelsInStorage bushels in storage and our population is $population.\n" +
      s"In order for everyone to survive we need at least ${population*20} bushels of grain.\n" +
      s"How much grain do you want to spend for the people that are serving you?\n")
    bushelsInStorage -= food
    food

  }


  def whatDoYouWantToDoWithYourLand(): Int = {
    var choice = readInt(s"O great Hammurabi Land currently worth $pricePerAcre and it's ${if (pricePerAcre - pricePerAcrePreviousYear >= 0)
      "more expensive than the previous year" else "cheaper than the previous year" }.\n" +
      " What do you want great Hammurabi, buy or shell? Press 1 to buy, 2 to sell, or 0 to continue.\n")
    choice match {
      case 1 =>  askHowMuchLandToBuy(bushelsInStorage,pricePerAcre)
      case 2 =>  askHowMuchLandToSell(bushelsInStorage)
      case _ =>  0
    }
  }
  def askHowMuchLandToSell(acresOwned: Int):Int = {

    var acresToSell = readInt("How many acres do you want sell?\n")
    while(acresToSell > acresOwned ) {
      acresToSell = readInt(s"But you own only $acresOwned acres. How many of them do you want to sell?\n")
    }
    bushelsInStorage += acresToSell * pricePerAcre
    acresToSell
  }

  def askHowMuchLandToBuy(bushels : Int, price : Int):Int = {
    var acresToBuy = readInt("How many acres will you buy?\n")
    while(acresToBuy<0 || acresToBuy* price > bushels) {
      println("O Great Hammurabi, we have but " +bushels+ "bushels of grain!\n")
      acresToBuy = readInt("How many acre will you buy?\n")
    }
    bushelsInStorage -= acresToBuy * pricePerAcre
    acresToBuy
  }

  def readInt(message: String): Int = {
    try {
      scala.io.StdIn.readLine(message+ "").toInt
    } catch {
      case _ : Throwable =>
        println("That's not an integer. Please enter an integer.\n")
        readInt(message)
    }
  }

  //Results of Hammurabi's actions

  def plague(): Int = {

    if(Random.nextInt(100)+1 <= 15) {
      population /= 2
      plagueDeaths = population
    }
    plagueDeaths = 0
    population
  }

  def hammurabiFailedAllHisPeople(result :  Int ): Boolean = {

    if(result/20 >= population/2) {
      population = result/20
      return false
    }
    true
  }
  //that's the last method we should call
  //because acresOwned, bushelsInStorage, and Population
  //are affected from other decisions and events.
  def howManyCameToTheCity(): Int = {

    var newCitizens =  (20 * acresOwned + bushelsInStorage) / (100 * population) + 1
    population+= newCitizens
    newCitizens
  }

  def harvestResults(acresPlanted : Int): Int = {
    bushelsPerAcre = Random.nextInt(8)+1
    harvest = bushelsPerAcre * acresPlanted
    bushelsInStorage+= harvest
    harvest
  }

  def ratProblems() : Int = {
    if(Random.nextInt(100)+1 <= 40) {
      rats_ate = Random.nextInt(20)+10
    }
    bushelsInStorage-=rats_ate
    rats_ate
  }

  def landCost() : Int = {
    pricePerAcre = Random.nextInt(7)+17
    pricePerAcre
  }



}


