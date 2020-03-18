package com.company;

public class Main {

    public static void main(String[] args) {


        Airplane Wizzair = new Airplane("Wizzair", 457);

        Engine Powerful = new Engine(2007,20000);
         Powerful.Engine();
        String Brand = Wizzair.MyBrand();
        int Seats = Wizzair.Number();
        int EngineProductionYear = Powerful.ProductionYear();
        double EnginePower = Powerful.Power();
        boolean EngineIsEcological = Powerful.Engine();

        System.out.println(" brand " + Brand + " Number of seats " + Seats + " where is was made engine " + EngineProductionYear + " powerful ");

    }
}
