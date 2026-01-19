package com.practical.q1;

abstract class Account {
    protected Owner owner;
    protected float balance;
    protected String accountNumber;

    public Account(Owner owner, float balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Not enough balance");
        }
    }

    @Override
    public String toString() {
        return "Account...\n" + owner + "\nBalance: " + balance +
               "\nAccountNumber:" + accountNumber;
    }
}