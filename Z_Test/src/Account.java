import java.util.ArrayList;
import java.util.List;

/*
시나리오
은행은 계좌를 관리한다.
은행은 계좌를 등록한다.
은행은 계좌번호로 계좌를 찾을 수 있다.
은행은 계좌의 소유자명으로 계좌를 찾을 수 있다.
은행은 모든 계좌의 목록을 볼 수 있다.
계좌는 소유자명, 계좌번호, 잔고로 구성된다.
계좌는 입금,출금 기능과 잔고확인 기능이 있다.
계좌에서 잔액의 변화가 있을 때마다 입출금 명세에 기록된다.
입출금 명세는 거래일자, 거래시간, 입금/출금, 금액, 잔액으로 구성된다.

클래스 다이어그램
시나리오로부터 클래스와 필드, 메소드를 추출해 내어야 한다.
시나리오에서 명사에 해당하는 것이 클래스나 필드로, 동사에 해당하는 것이 메소드가 될 것이다.

 */
public class Account {
	private String accoutNo;
	private String name;
	private int balance;
	private List<Transaction> transaction;
	
	public Account(String name , String accountNo) {
		transaction = new ArrayList<Transaction>();
		this.accoutNo = accountNo;
		this.name = name;
		
	}


	public Account(String name, String accoutNo, 
				   int balance, ArrayList<Transaction> transaction) {
		this.accoutNo = accoutNo;
		this.name = name;
		this.balance = balance;
		this.transaction = transaction;
	}



	public String getAccoutNo() {
		return accoutNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accoutNo = accoutNo;
	}



	public String getName() {
		return name;
	}



	public void deposit(long amount) {
		
		this.balance += amount;
		transaction.add(new Transaction("입금", amount, balance));
		System.out.printf("입금 : %d  ->   현재잔액 : %d원\n", amount, this.balance);
		
	}
	
	public void withdraw(long amount) {
		
		if(this.balance < amount) {
			System.out.println("잔고(잔액) 부족입니다.");
			return;
		}
		else if(this.balance >= amount) {
			this.balance -= amount;
			transaction.add(new Transaction("출금", amount, balance));
			System.out.printf("출금 : %d   ->   현재잔액 : %d원\n", amount,this.balance);
		}else {
			System.out.println("잘못된 계좌번호입니다.");
		}
		
		
		
		
	}
	
	public long getBalance() {
		return this.balance;
		
	}
	
	public void getTransactions() {
		
		System.out.println(transaction);
		
	}



	@Override
	public String toString() {
		return "계좌번호 : " + accoutNo + ", 계좌주 : " + name + ", "
				+ "잔고(잔액) : " + balance + ", 내역 : " + transaction;
	}
	
	
}
	
