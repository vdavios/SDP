package main.scala.Film

/**
  * Created by vasileiosdavios on 5/14/17.
  */
case class FilmCaseClass(name: String, yearOfRelease: Int, imdbRating: Double, director: Director) {
  def directorsAge: Int = yearOfRelease - director.yearOfBirth
  def isDirectedBy(myGuess: Director): Boolean = myGuess.equals(director)
  def copy(name:String = name, yearOfRelease: Int = yearOfRelease, imdbRating: Double = imdbRating,
           director: Director = director): Film = {new Film(name, yearOfRelease, imdbRating, director)}
  def highestRating(firstFilm: Film, secondFilm: Film): Film =
    if (firstFilm.imdbRating > secondFilm.imdbRating) firstFilm else secondFilm
  def oldestDirectorAtTheTime(firstFilm: Film, secondFilm: Film): Director =
    if(firstFilm.directorsAge > secondFilm.directorsAge ) firstFilm.director else
      secondFilm.director
}
