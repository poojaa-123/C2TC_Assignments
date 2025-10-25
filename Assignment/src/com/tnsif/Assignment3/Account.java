package com.tnsif.Assignment3;

import java.awt.print.Book;

public abstract class Account extends Book {
    protected String accountHolderName;
    protected double balance;

    // Constructor
    public Account(String accountHolderName, double initialBalance) {
        super(); // increments totalAccounts
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Concrete method - display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }
}