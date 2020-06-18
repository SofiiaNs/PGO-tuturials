package com.company;

import java.util.ArrayList;

    public class Administrator extends Employee {
    private static int RETORT = 0;
    private ArrayList<Employee> employee;

        public Administrator(String name, String surname) {
        super(name, surname);
        this.employeeID = RETORT++;
    }
        public Employee createEmployee(String name, String surname) {
        Employee unknown = new Employee(name, surname);
        employee.add(unknown);
        return unknown;
    }
        public void removeEmployee(Employee unknown) {
        employee.remove(unknown);
    }
}