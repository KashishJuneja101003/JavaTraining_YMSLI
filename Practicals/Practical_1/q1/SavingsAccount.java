package com.practical.q1;

public class SavingsAccount extends Account {
    private final float interestRate = 5;

    public SavingsAccount(Owner owner, float balance, String accountNumber) {
        super(owner, balance, accountNumber);
    }

    public float getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInterestRate=" + interestRate;
    }
}