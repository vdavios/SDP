
public class DogForReflection implements Animal {

  private String dogName ;
  private int dogAge;

  public DogForReflection(String name, int age) {
    setName(name);
    setAge(age);
  }
  //private DogForReflection(){}

  public String getName () {
    return dogName;
  }

  public int getAge() {
    return  dogAge;
  }


  public void setName(String name) {
    setDogName(name);
  }

  public void setAge(int age) {
   setDogAge(age);
  }

  private void setDogName(String name){
    dogName = name;
  }
  private void setDogAge(int age){
    if(age<0 || age > 20) {
      System.out.println("please give me a valid age");
      return;
    }

    dogAge = age;
  }
}
