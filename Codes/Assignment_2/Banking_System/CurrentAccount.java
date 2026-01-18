package Banking_System;

public class CurrentAccount extends Account{
	private int tradeLicenseNumber;
	private double overdraft;
	
	public double getBalance() {
		return getAccountBalance();
	}

	@Override
	public void withdraw(double amount) {
		if(amount > getAccountBalance() + overdraft) {
			throw new lessBalanceThanRequestedException("Withdrawal exceeds overdraft limit.");
		}
		
		setAccountBalance(getAccountBalance()-amount);
	}
	
}
