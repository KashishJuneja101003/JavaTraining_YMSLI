package Assignment_5_Q2_Synchronization;

public class Company implements Runnable{
	private Account account;

	public Company(Account account) {
		this.account = account;
	}
	
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			account.addAmount(1000);
		}
	}
}
