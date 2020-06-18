package com.company;

import java.lang.Math.*;
public class Transaction {

    private static int RETORT = 0;
    private double TransactionValue;
    private int TransactionID;
    private BankAccount From;
    private BankAccount To;

    public Transaction(double transactionValue, BankAccount from, BankAccount to) {
        this.TransactionValue = transactionValue;
        this.TransactionID = RETORT++;
        this.From = from;
        this.To = to;
    }
        public int getTransactionID() {
        return TransactionID;
    }
        public double getTransactionValue() {
        return TransactionValue;
    }
        public BankAccount getFrom() {
        return From;
    }
        public BankAccount getTo() {
        return To;
    }
}