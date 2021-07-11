import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
	private int totalAccount;
	private List<Account> accounts;

	public Bank() {
		this.totalAccount = 0;
		this.accounts = new ArrayList<Account>();
	}
	
	public void addAccount(String name ,String accountNo) {
		accounts.add(new Account(name ,accountNo));
	}
	
	public Account getAccount(String accountNo) {
		Account num = null;
		for(int i = 0; i < accounts.size(); i++) {
			String ac = accounts.get(i).getAccoutNo();
			if(ac.equals(accountNo)){
				num = accounts.get(i);
			}
		}
		return num;
		
	}
	
	public List<Account> findAccounts(String name) {
		List<Account> find = new ArrayList<>();
		Account now;
		Iterator<Account> it = accounts.iterator();
		while(it.hasNext()) {
			now = it.next();
			if(now.getName().equals(name)) 
				find.add(now);
			
		}
		System.out.println(find);
		return find;
	}
	
	public List<Account> getAccounts() {
		List<Account> accountlist = new ArrayList<Account>();
		for(int i = 0; i < accounts.size(); i++) {
			accountlist.add(accounts.get(i));
		}
		Iterator<Account> it2 = accountlist.iterator();
		System.out.println("================");
		System.out.println("전체 계좌 리스트");
		System.out.println("================");
		while(it2.hasNext()) {
			System.out.println(it2.next());	
			}
		return accountlist;
	}
	
	public int getTotalAccount() {
		System.out.print("총 계좌수 : ");
		return accounts.size();
	}
}
