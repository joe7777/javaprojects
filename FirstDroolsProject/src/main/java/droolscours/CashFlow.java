package droolscours;

import java.util.Date;

public class CashFlow {
	
	private Date mvtDate;
	private double amount;
	private int type;
	private long accountNo;
	public CashFlow() {

	}
	public CashFlow(Date mvtDate, double amount, int type, long accountNo) {
		super();
		this.mvtDate = mvtDate;
		this.amount = amount;
		this.type = type;
		this.accountNo = accountNo;
	}
	public Date getMvtDate() {
		return mvtDate;
	}
	public void setMvtDate(Date mvtDate) {
		this.mvtDate = mvtDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	
}
