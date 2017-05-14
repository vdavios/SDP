package singleton;

public class LazySingleton {

  private static  LazySingleton instance;
  private LazySingleton(){}
  public static LazySingleton getInstance() {

    return instance = new LazySingleton();
  }

}
