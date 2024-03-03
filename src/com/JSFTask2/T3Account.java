package com.JSFTask2;

public class T3Account {
    private double balance;

    public T3Account() {
        this.balance = 0;
    }
    public T3Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public T3Account(double initialBalance, double interestRate) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited Rs." + amount + ". New balance: Rs." + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew Rs." + amount + ". New balance: Rs." + this.balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    public void displayBalance() {
        System.out.println("Current balance: Rs." + this.balance);
    }

    public static void main(String[] args) {

        T3Account T3Account1 = new T3Account();
        T3Account1.displayBalance();
        T3Account1.deposit(10000);
        T3Account1.withdraw(5000);
        T3Account T3Account3 = new T3Account(1000, 0.05);
        /* no description given in task list only mentioned 2 arguments so used the interestRate variable
         but didnt include any method or used interestRate */

    }
}

