public class Modifiers {
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "John";
        // myAcc.password = "abcdefgh" //can't access
        myAcc.setPassword("abcdefgh"); //can be changed  

        System.out.println(myAcc.username);
    }
}
class BankAccount{
   public String  username;
   private String password;
   public  void  setPassword(String pwd){
         password = pwd;
   }

}
