package singleton;


public class ActiveSingleton {

  private static ActiveSingleton instance = new ActiveSingleton();
  private ActiveSingleton(){}

  public static ActiveSingleton getInstance() {
    return instance;
  }
}
