package com.company;

public abstract class Animal {
    String Name;
    public Animal(String name){
        this.Name = name;
    }
    public String getName(){
        return Name;
    }
    abstract String getType();
}
