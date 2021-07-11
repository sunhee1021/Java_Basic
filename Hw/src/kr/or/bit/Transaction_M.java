package kr.or.bit;

import java.util.Calendar;

public class Transaction_M {
	
    private String transactionDate;
    private String transactionTime;
    private String kind;
    private long amount;
    private long balance;
	
    public Transaction_M(String transactionDate, String transactionTime, String kind, long amount, long balance) {
    	Calendar cal = Calendar.getInstance();

    	this.transactionDate = cal.get(Calendar.YEAR)+"-"
    	+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.DATE);

		this.transactionTime = cal.get(Calendar.HOUR)+":"
		+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);

		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Transaction [transactionDate=" + transactionDate + ", transactionTime=" + transactionTime + ", kind="
				+ kind + ", amount=" + amount + ", balance=" + balance + "]";
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
   

}
