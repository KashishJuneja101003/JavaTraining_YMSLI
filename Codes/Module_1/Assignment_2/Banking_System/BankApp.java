package Banking_System;

public class BankApp{
	public static void main(String[] args) {
		SavingsAccount sAccount = new SavingsAccount();
		
		System.out.println("Savings Account...");
		
		sAccount.setAccountNumber("123");
		System.out.println("Account Number: " + sAccount.getAccountNumber());
		
		sAccount.setAccountBalance(100);
		System.out.println("Account Balance: " + sAccount.getAccountBalance());
		
		sAccount.deposit(20000);
		System.out.println("Deposited Amount, Updated Balance: " + sAccount.getAccountBalance());
		
		sAccount.withdraw(200);
		System.out.println("Withdrew Amount, Updated Balance: " + sAccount.getAccountBalance());
		
		
		CurrentAccount cAccount = new CurrentAccount();
		
		System.out.println("\nCurrent Account...");
		
		cAccount.setAccountNumber("456");
		System.out.println("Account Number: " + cAccount.getAccountNumber());
		
		cAccount.setAccountBalance(10000);
		System.out.println("Account Balance: " + cAccount.getAccountBalance());
		
		cAccount.deposit(20000);
		System.out.println("Deposited Amount, Updated Balance: " + cAccount.getAccountBalance());
		
		cAccount.withdraw(200);
		System.out.println("Withdrew Amount, Updated Balance: " + cAccount.getAccountBalance());
		
	}	
}
