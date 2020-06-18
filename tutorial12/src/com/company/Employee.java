package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class Employee extends User {
    private static int RETORT = 0;
    int employeeID;

        ArrayList<Client> clients = new ArrayList<>();
        public Employee(String name, String surname) {
        super(name, surname);
        this.employeeID = RETORT++;

    }
        public Client addClient(String name, String surname, double accountBalance) {
        BankAccount b = new BankAccount(accountBalance, null);
        Client c = new Client(b, name, surname);
        return c;
    }
        public void acceptPayment(double payment, BankAccount from, BankAccount to) throws AccountOperationsExeption {
        from.makeTransfer(payment, to);

    }
            public void acceptPayment(double payment, BankAccount account) throws AccountOperationsExeption {
            account.makePayment(payment);
    }
}
