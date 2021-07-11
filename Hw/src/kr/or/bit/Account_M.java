package kr.or.bit;

import java.util.ArrayList;

//set 값을 입력한다
//get 값을 불러온다

public class Account_M {

    private String accountNo; //계좌번호
    private String name;      //소유자명
    private long balance;     //잔고(잔액)
    private ArrayList<Transaction_M> transaction; //거래내역
    
    public Account_M() {
        
    }
    
    public Account_M(String accountNo, String name, ArrayList<Transaction_M> transaction) {
        this.accountNo = accountNo;
        this.name = name;
        this.transaction = new ArrayList<Transaction_M>();
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", transactions="
                + transaction + "]";
    }

    //입금한다
    public String getAccountNo() {
        return this.accountNo;
    }

    
    //출금한다
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //잔고를 확인한다
    public long getBalance() {
        // TODO implement here
        return 0;
    }

    //거래내역을 본다
    public ArrayList<Transaction_M> getTransaction() {
        return transaction;
    }


    //거래금액을 받아서 입금처리
    public void deposit(long amount) {
        this.balance += amount; //입금
      
      }


    //거래금액을 받아서 출금처리
    public void withdraw(long amount) {
        if(amount > balance) {
            System.out.println("잔액부족");
            return;
        }else {
            this.balance -= amount; //출금
            System.out.println(amount+"원 출금");
        }
    }


    /**
     * @return
     */
    //    public Set<Transaction> getTransaction() {
    //        // TODO implement here
    //        return null;
    //    }

}
