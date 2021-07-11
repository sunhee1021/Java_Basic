
public class BankMain {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.addAccount("박선희", "111-111");
		bank.addAccount("하동훈", "222-222");
		
		System.out.println(bank.getTotalAccount());
		
		bank.findAccounts("박선희");
		
		bank.getAccount("111-111").deposit(10000);
		
		bank.getAccount("111-111").withdraw(1000);
		
//		bank.getAccount("111-111").getBalance();
		
//		bank.getAccount("111-111").deposit(21000);
		
		bank.getAccount("111-111").getTransactions();
		
//		bank.findAccounts("박선희");
		
		
		
		
	}

}
