package Assignment_5_Q2_Synchronization;

public class DriverClass {
	public static void main(String[] args) {
		Account account = new Account(10000);
		
		Runnable bank = new Bank(account);
		Runnable company = new Company(account);
		
		Thread bankThread = new Thread(bank);
		Thread companyThread = new Thread(company);
		
		bankThread.start();
		companyThread.start();
		
		System.out.println("Final Balance: " + account.getBalance());
	}
}
