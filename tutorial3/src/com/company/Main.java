package com.company;

public class Main {

    public static void main(String[] args) {


        Airplane Wizzair = new Airplane("Wizzair", 457);

        Engine Powerful = new Engine(2007,20000);
         Powerful.Engine();
        String Brand = Wizzair.getBrand();
        int Seats = Wizzair.getNumber();
        int EngineProductionYear = Powerful.getProductionYear();
        double EnginePower = Powerful.getPower();
        boolean EngineIsEcological = Powerful.Engine();

        System.out.println(" brand " + Brand + " Number of seats " + Seats + " where is was made engine " + EngineProductionYear + " powerful ");

    }
}
