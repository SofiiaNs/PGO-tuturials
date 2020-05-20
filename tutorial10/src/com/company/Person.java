package com.company;

public abstract class Person {
    String FirstName;
    String LastName;
    double BirthdayYear;

    public Person(String FirstName, String LastName, double BirthdayYear) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BirthdayYear = BirthdayYear;
    }
        public double getAge(){
        double age = 1999 - BirthdayYear;
        return age;
    }

}