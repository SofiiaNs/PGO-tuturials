package com.company;

import java.util.ArrayList;

public class BankAccount extends AccountOperations {
    private int BankAccountID;
    private static int RETORT = 0;
    private ArrayList<Transaction> ListOfTransactions;
    private double AccountBalance = 0;


        public BankAccount(double accountBalance, ArrayList<Transaction> listOfTransactions) {
        this.BankAccountID = RETORT++;
        this.AccountBalance = accountBalance;
        this.ListOfTransactions = listOfTransactions;
    }
        public double getAccountBalance() {
        return AccountBalance;
    }
        public void setAccountBalance(double accountBalance) {
        this.AccountBalance = accountBalance;
    }
        public ArrayList<Transaction> getListOfTransactions() {
        return ListOfTransactions;
    }
        public void setListOfTransactions(ArrayList<Transaction> listOfTransactions) {
        this.ListOfTransactions = listOfTransactions;
    }
        public double checkAccountBalance() {
        return AccountBalance;
    }
          public void makePayment(double amount) throws AccountOperationsExeption {
          if(AccountBalance>=amount) {
            AccountBalance += amount;
            Transaction t = new Transaction(amount, this, this);
            ListOfTransactions.add(t);
        }else {
            AccountOperationsExeption nomoney = new AccountOperationsExeption("I don't have any fucking money");
        }
    }
            public void makeTransfer(double amount, BankAccount to) throws AccountOperationsExeption {
            if(AccountBalance>=amount) {
            AccountBalance -= amount;
            to.AccountBalance += amount;
            Transaction t = new Transaction(amount, this, to);
            ListOfTransactions.add(t);
            }else {
            AccountOperationsExeption nomoney = new AccountOperationsExeption("YOU don't have any fucking money");
        }
    }
}