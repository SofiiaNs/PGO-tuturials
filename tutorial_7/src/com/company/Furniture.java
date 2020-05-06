package com.company;

public class Furniture {
    private static final double vat = 0.23;

    private String Name;
    private double Price;

    public Furniture() {
    }

    public Furniture(String name, double price) {
        this.Name = name;
        this.Price = price;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public double getVatPrice() {
        return Price + Price * vat;
    }
}
