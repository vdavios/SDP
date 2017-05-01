import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;


public class JTest {
  private Field[] fields;
  private Method[] methods;
  private Constructor[] constructors;

  @Before
  public void beforeTest() {
    String testingClass = "DogForReflection"; // replace with the name of the class you want to test
    try {
     Class classToTest = Class.forName(testingClass);
      fields = classToTest.getDeclaredFields();
      methods= classToTest.getDeclaredMethods();
      constructors = classToTest.getDeclaredConstructors();

    } catch(ClassNotFoundException e){
      e.printStackTrace();
    }
  }


  @Test
  public void fieldCount() {
    if(fields.length>4){
      fail("You have more than four fields");
    }
  }

  @Test
  public void fieldsAccessibility() {
    for (Field field : fields) {
      if(Modifier.isPublic(field.getModifiers())){
        fail("Non-private fields are not allowed");

      }
    }
  }

  @Test
  public void fieldType(){
    for (Field field: fields) {
      if(ArrayList.class.isAssignableFrom(field.getType())){
        fail("Fields of type ArrayList are not allowed");
      }
    }
  }
  @Test
  public void methods(){
    int meth=0;
    for(Method method: methods) {
      if(Modifier.isPrivate(method.getModifiers())){
        meth++;
      }
    }
    if(meth<2){
      fail("you need at least two private methods");
    }
  }
  @Test
  public void exceptions(){
    for(Method method : methods){
     Class[] exceptions = method.getExceptionTypes();
     if(exceptions.length>0){
       fail("exceptions are not allowed");
     }
    }
  }

  @Test
  public void returnType(){
    for(Method method: methods){
      if(method.getReturnType().equals(int.class)){
        fail("returning int is not allowed");

      }
    }
  }

  @Test
  public void zeroArgumentConstructor(){
    int zeroArgConst = 0;
    for(Constructor constructor: constructors) {
      if(constructor.getParameterCount()==0){
        zeroArgConst++;
      }
    }
    if(zeroArgConst!=1){
      fail("You need a zero-argument constructor");
    }
  }


  @After
  public void afterTest(){

    fields=null;
    methods=null;
    constructors=null;
  }




}
