package com.company;

public class Product {
    String Name;
    double Price;
    double Code;
    long NumberOfPieces;


    public Product(String name, double price, double code, long numberOfPieces) {
        Name = name;
        Price = price;
        Code = code;
        NumberOfPieces = numberOfPieces;


    }

    public Product(String name, double price, double code) {
        Name = name;
        Price = price;
        Code = code;
    }
       public String getName() {
        return Name;
    }
       public void setName(String name) {
        Name = name;
    }
       public double getPrice() {
        return Price;
    }
      public void setPrice(double price) {
        Price = price;
    }
      public double getCode() {
        return Code;
    }
      public void setCode(double code) {
        Code = code;
    }
      public long getNumberOfPieces() {
        if (NumberOfPieces >= 0) {
            return NumberOfPieces;
        } else {
            NumberOfPieces = 0;


            return NumberOfPieces;
        }
    }

    public void setNumberOfPieces(long numberOfPieces) {
        NumberOfPieces = numberOfPieces;
    }
}
