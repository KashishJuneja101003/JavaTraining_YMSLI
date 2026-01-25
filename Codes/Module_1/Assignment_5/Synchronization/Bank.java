package Assignment_5_Q2_Synchronization;

public class Bank implements Runnable {
	private Account account;

	public Bank(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			account.subtractAmount(1000);
		}
	}

}
