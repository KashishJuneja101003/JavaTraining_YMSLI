package Assignment_5_Q2_Synchronization;

public class Account {
    private double balance;
    
    public Account(double balance) {
		super();
		this.balance = balance;
	}
    
    public void addAmount(double amount) { 
    	this.balance += amount;
    }
    public void subtractAmount(double amount) { 
		this.balance -= amount;
	}
    
 
	public double getBalance() {
		return balance;
	}
	
    public void setBalance(double balance) {
		this.balance = balance;
	}
}