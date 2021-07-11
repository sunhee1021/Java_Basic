package kr.or.bit;
public class Bank_Quiz_M {

    public static void main(String[] args) {
       Bank_M bank = new Bank_M();
         bank.addAccount("123", "이");
       	 bank.addAccount("456", "이");
       	 
       	 
         bank.findAccounts("박");
         
       
//         bank.getTotalAccount();
       
    }
 }