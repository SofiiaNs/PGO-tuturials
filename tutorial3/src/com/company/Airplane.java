package com.company;

public class Airplane {
    String Brand;
    int Seats;



    public Airplane(String Brand, int Seats){
        this.Brand = Brand;
        this.Seats = Seats;

    }
    public int Number() {
        return this.Seats ;
    }

    public void Seats(int Seats) {
        this.Seats = Seats;
    }

    public String MyBrand() {
        return this.Brand;
    }
    public void Brand( String Brand){this.Brand = Brand;}


}
