package com.practical.q1;

public class TestDrive {
    
    public static void main(String[] args) {

        Date date = new Date(19, 01, 2026);
        Owner owner = new Owner("Kashish", date, "NIC1");

        SavingsAccount sa = new SavingsAccount(owner, 5000, "SA001");

        sa.deposit(1000);
        sa.withdraw(2000);

        System.out.println(sa + "\n");
        
        
        CurrentAccount ca = new CurrentAccount(owner, 1000, "CA001");
        
        ca.deposit(2000);
        ca.withdraw(0);
        
        System.out.println(ca);
    }
}
