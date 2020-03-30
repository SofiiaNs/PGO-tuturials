package com.company;

public class Cars {
    String Color;
    String Brand;
    int Enginecapacity;

    public Cars(String Brand, String Color, int Enginecapacity) {
        this.Brand = Brand;
        this.Color = Color;
        this.Enginecapacity = Enginecapacity;

    }

    public int Getlitres() {
        return this.Enginecapacity;
    }

    public String Getcolor() {
        return this.Color;
    }

    public String Getbrand() {
        return this.Brand;

    }

    public void Enginecheck() {
        if (Enginecapacity >= 21) {
            System.out.println("high-speed");
        } else {
            System.out.println("low-speed");
        } ;
    }


}
