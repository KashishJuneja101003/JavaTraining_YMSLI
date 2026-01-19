package com.practical.q1;

public class CurrentAccount extends Account {
    private final float minimumBalance = 1000;
    private final float charges = 2000;

    public CurrentAccount(Owner owner, float balance, String accountNumber) {
        super(owner, balance, accountNumber);
    }

    @Override
	public String toString() {
		return super.toString() + "\nMinimumBalance=" + minimumBalance;
	}

	@Override
    public void withdraw(int amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
        } else {
            System.out.println("Cannot withdraw. Minimum balance required: " + minimumBalance);
        }
    }
	
	public float getCharges() {
		return charges;
	}
}