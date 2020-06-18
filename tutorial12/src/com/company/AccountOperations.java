package com.company;

public abstract class AccountOperations {
    abstract double checkAccountBalance();
    abstract void makePayment(double amount) throws AccountOperationsExeption;
    abstract void makeTransfer(double amount, BankAccount to) throws AccountOperationsExeption;

}


