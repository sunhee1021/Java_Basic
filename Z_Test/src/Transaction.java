import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
	
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
	
	public Transaction(String kind, long amount, long balance) {
		
		this.transactionDate = dateFormat.format(cal.getTime());
		this.transactionTime = timeFormat.format(cal.getTime());
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "거래내역 : ["+ kind +"][거래금액 : " + amount + "][잔고(잔액) : " + balance + "]"
				+ "[거래날짜 : " + transactionDate + "][거래시간 : " + transactionTime +"]\n";
	}
	
	
	
	
	
}
