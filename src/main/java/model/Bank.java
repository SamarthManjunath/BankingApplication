package model;

public class Bank {
	
	private int accountNumber;
	private String accountPassword;
	
	public Bank(int accountNumber, String accountPassword) {
		super();
		this.accountNumber = accountNumber;
		this.accountPassword = accountPassword;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	
	

}
