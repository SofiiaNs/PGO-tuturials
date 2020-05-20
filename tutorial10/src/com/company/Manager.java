package com.company;

public class Manager extends Employee {
    double Bonus;

        public Manager(String FirstName, String LastName, double BirthdayYear, String CompanyName, double HireDate, double Salary, double Bonus) {
        super(FirstName, LastName, BirthdayYear, CompanyName, HireDate, Salary);
        this.Bonus = Bonus;
    }
    @Override
        public double getSalary() {
        double Rise = Bonus+Salary ;
        return  Rise;
    }
    @Override
        public String toString() {
        return "manager " + this.LastName +" and age " +getAge() + " salary " + getSalary();
    }
}