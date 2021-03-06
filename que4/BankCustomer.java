package day5.que4;

public class BankCustomer {
	private int customerId;
	private String name;
	private String address;
	private double accountBalance;
	public BankCustomer(int customerId, String name, String address, double accountBalance) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.accountBalance = accountBalance;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String toString() {
		return customerId+" "+name+" "+address+" "+accountBalance;
	}
	

}
