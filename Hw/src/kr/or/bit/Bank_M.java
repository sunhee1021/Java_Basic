package kr.or.bit;

//두 클래스가 선으로 연결되어 있다면 두 클래스로부터 생성된 객체들은 서로 관계가 있다.
//속이 찬 다이아몬드는 객체가 다른 객체를 부품처럼 가지고 있는 관계를 나타낸다.
//0이나 *는 부품처럼 쓰는 객체의 최대 갯수로. 0..*는 0개 이상을 의미한다.
//화살표는 객체가 다른 객체의 메소드를 호출하는 방향이다.
import java.util.ArrayList;
import java.util.Set;

public class Bank_M {
	
    private ArrayList<Account_M> accounts; //계좌
	private int totalAccount; //총 계좌수
	
	public Bank_M() {
		this.totalAccount = 0;
		this.accounts = new ArrayList<Account_M>();
	}
    
	//계좌를 생성한다
    public void addAccount(String accountNo, String name) { 
    
    ArrayList<Transaction_M> transaction = null;
    accounts.add(new Account_M(accountNo,name, transaction));
    }
//    public void print() {
//    	System.out.println(accounts.get(0));
//    }
//  
    //계좌를 찾는다(계좌번호로)
    public Account_M getAccount(String accountNo) {
    	for(int i = 0; i<accounts.size();i++){
    	accounts.get(i).equals(accountNo);
    	System.out.println(accounts.get(i).toString());
    	}
		return null;
	}
//    Account[] temp = new Account[totalAccount];
//    int total = 0;
//    for (int i = 0; i < totalAccount; i++) {
//      if (name.equals(accounts[i].getName())) {
//        temp[total++] = accounts[i];
//      }
//    }
//    Account[] matched = new Account[total];
//    for (int i = 0; i < total; i++) {
//      matched[i] = temp[i];
//    }


    
    //계좌를 찾는다(소유자명으로)
    public Account_M findAccounts(String name) {
    	for(int i = 0; i<accounts.size();i++){
        	accounts.get(i).equals(name);
        	System.out.println(accounts.get(i).toString());
        	}
    		return null;
    
    }

    //계좌목록을 본다
    public Set<Account_M> getAccounts() {
        // TODO implement here
        return null;
    }

    //총계좌수를 반환한다
//    public int getTotalAccount() {
//        for(Account_M a : accounts) {
//        //	totalAccount += a.acc;
//        }
    }





