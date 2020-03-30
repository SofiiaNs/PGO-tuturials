package com.company;

public class Main {

    public static void main(String[] args) {


        //Testing Phone

        Phone Samsung = new Phone("Samsung", "hello",56,91123 );
        int Phonenumber = Samsung.Getnumber();
        System.out.println(Phonenumber);
        String Messenge = Samsung.Getmessenge();
        System.out.println("Sending the messenge " + Messenge + " to number " + Phonenumber);

        //t2

        Cars Porshe = new Cars("Porshe" , "red" , 44);
        int Enginecapacity = Porshe.Getlitres();
        String CarColor = Porshe.Getcolor();
        String Brand = Porshe.Getbrand();
        System.out.print("engine capacity " + Enginecapacity + " Brand " + Brand + " Car color " +  CarColor + " "  );
        Porshe.Enginecheck();

    }
}
