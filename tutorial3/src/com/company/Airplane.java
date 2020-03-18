package com.company;

public class Airplane {
    String Brand;
    int Seats;



    public Airplane(String Brand, int Seats){
        this.Brand = Brand;
        this.Seats = Seats;

    }
    public int getNumber() {
        return this.Seats ;
    }

    public void setNumberOfSeats(int Seats) {
        this.Seats = Seats;
    }

    public String getBrand() {
        return this.Brand;
    }
    public void setBrand( String Brand){this.Brand = Brand;}


}
