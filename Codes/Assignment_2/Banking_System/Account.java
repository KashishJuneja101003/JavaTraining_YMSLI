package Banking_System;

public abstract class Account {
	private String name;
    private String accountNumber;
    private double accountBalance;

    public void deposit(double amount){
        this.accountBalance += amount;
    }

    public abstract void withdraw(double amount);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
