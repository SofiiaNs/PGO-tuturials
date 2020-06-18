package com.company;

public class Main {

    public static void main(String[] args) throws AccountOperationsExeption {

        Administrator admin = new Administrator("Sofiia","Major");
        Employee e1 = new Employee("Jack","vhdhdjdj");
        Employee e2 = new Employee("Billy","Ailish");

        Client e3 = new Client(new BankAccount(500.00,null),"dnjkn","kmmhm");
        Client e4 = new Client(new BankAccount(200.00,null),"kjmbi","jfjfv");
        Client e5 = new Client(new BankAccount(400.00,null),"kinb","jnnnbi");
        Client e6 = new Client(new BankAccount(300.00,null),"utgkt","ufufjfi");



    }
}