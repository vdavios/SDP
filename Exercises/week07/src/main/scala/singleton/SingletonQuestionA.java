package singleton;


public class SingletonQuestionA {
  public static void main(String[] args) {
    /**
     * Instance is created at run time
     */
    ActiveSingleton active = ActiveSingleton.getInstance();
    /**
     * Created after we instanciated
     */
    LazySingleton lazy = LazySingleton.getInstance();
  }
}
