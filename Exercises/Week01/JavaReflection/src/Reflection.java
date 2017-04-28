import java.lang.reflect.*;
import java.util.Arrays;

public class Reflection {


  public static void main(String[] args) {

  /* System.out.println("Please give the class name");
    Scanner scanner = new Scanner(System.in);
    String aClass = scanner.nextLine();*/

  String reflectedClass = "DogForReflection";
    try {
      Class<?> myClass = Class.forName(reflectedClass);

      //Get the interfaces that our class implements
      Class[] interfaces = myClass.getInterfaces();
      for(Class anInterface : interfaces){
        System.out.println("The class "+myClass.getName()+" implements  "+ anInterface.getName());
        System.out.println();
      }
      //Constructors
      Constructor[] constructors = myClass.getDeclaredConstructors();

      for(Constructor constructor : constructors){

        System.out.println("Constructor Name: "+ constructor.getName()+ " is " +
                Modifier.toString(constructor.getModifiers())+ " and has "+ Arrays.toString(constructor.getParameterTypes())
                + " as parameters");
        System.out.println();
      }

      //Creating an object
      Object constructor = myClass.getDeclaredConstructor(String.class, int.class).newInstance("first dog",5);

      //Fields
      Field[] fields = myClass.getDeclaredFields();
      for(Field field : fields) {
        System.out.println(field.getName()+ " is " + Modifier.toString(field.getModifiers()));
        System.out.println();
      }

      System.out.println();

      //Methods
      Method[] methods = myClass.getDeclaredMethods();
      //the name of each method
      for(Method method : methods){
        System.out.println("The method name is "+method.getName());
        System.out.println();
      }


    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException |
            InstantiationException | InvocationTargetException e) {
      e.printStackTrace();
    }
  }

}
