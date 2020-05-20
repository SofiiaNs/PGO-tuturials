package com.company;

public class Employee extends Person {

    double Salary;
    String CompanyName;
    double HireDate;

    public Employee(String FirstName, String LastName, double BirthdayYear, String CompanyName, double HireDate, double Salary) {
        super(FirstName, LastName, BirthdayYear);
        this.Salary = Salary;
        this.CompanyName = CompanyName;
        this.HireDate = HireDate;
    }
        public double getSalary() {
        return Salary;
    }
        public double getJobSeniority(){
        double salarySenior = 27;
        return salarySenior;
    }
}