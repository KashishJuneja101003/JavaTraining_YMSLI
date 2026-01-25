package Banking_System;

public class SavingsAccount extends Account{
	private final int interest = 5; // 5%
	private double maxWithdrawLimit;
	private double minimumBalanceAllowed = 5000;
	
	public double getBalance() {
		double accountBalance = getAccountBalance();
		return accountBalance + (accountBalance * interest / 100);
	}

	@Override
	public void withdraw(double amount) {
		maxWithdrawLimit = getAccountBalance();
		if(amount > maxWithdrawLimit) {
			System.out.println("limit " + maxWithdrawLimit);
			throw new lessBalanceThanRequestedException("You do not have $" + amount + "in your account");
		}
		
		if((getBalance() - amount) < minimumBalanceAllowed) {
			throw new lessBalanceThanRequestedException("You have to keep minimum balance of $" + minimumBalanceAllowed);
		}
		
		setAccountBalance(getAccountBalance()-amount);
	}
	
}
