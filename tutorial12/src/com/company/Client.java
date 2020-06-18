package com.company;

public class Client extends User {
    private static int RETORT = 0;
    private BankAccount Account;
    private int ClientID;

    public Client(BankAccount account, String name, String surname) {
        super(name, surname);
        this.Account = account;
        this.ClientID = RETORT++;

    }
        public void payIn(double amount) throws AccountOperationsExeption {
        this.Account.makePayment(amount);
    }
        public void makeTransfer(double amount, BankAccount to) throws AccountOperationsExeption {
        this.Account.makeTransfer(amount, to);
    }
}