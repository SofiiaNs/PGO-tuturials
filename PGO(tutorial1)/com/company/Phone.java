package com.company;

public class Phone {

    String Brand;
    String Messenge;
    int Screenresolution;
    int Phonenumber;

    public Phone(String Brand, String Messenge,  int Screenresolution, int Phonenumber) {
        this.Brand = Brand;
        this.Screenresolution = Screenresolution;
        this.Phonenumber = Phonenumber;
        this.Messenge = Messenge;

    }

    public int Getnumber() {
        return this.Phonenumber;
    }
    public String Getmessenge(){
        return this.Messenge;
    }
}
