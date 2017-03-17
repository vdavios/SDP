
public class Driver {

  public static void main(String[] args){
    Storage<BankAccount> aStorage = new Storage<>();
    Storage<String> sStorage = new Storage<>();

    Class<BankAccount> baCls = BankAccount.class;
    try {
      BankAccount myAccount = (BankAccount)baCls.newInstance(); //redundant casting just following the code from notes.
      aStorage.setValue(myAccount);

      myAccount.deposit(15);
    }catch (InstantiationException | IllegalAccessException e){
      e.printStackTrace();
    }

    System.out.println(aStorage.getValue().showBalance());
    if(aStorage.getClass()== sStorage.getClass()) {
      System.out.println("Equal");
    } else {
      System.out.println("Not equal");
    }
  }
}
