package com.company;

public class Engine {
    int EngineProductionYear;
    double EnginePower;
    boolean EngineIsEcological;

    public Engine(int EngineProductionYear,int EnginePower){
        this.EngineProductionYear = EngineProductionYear;
        this.EnginePower = EnginePower;

    }

    public double Power() {
        return this.EnginePower;
    }

    public void Power(double Power) {
        this.EnginePower = EnginePower;
    }

    public int ProductionYear() {
        return this.EngineProductionYear;
    }

    public void ProductionYear(int EngineProductionYear) {
        this.EngineProductionYear = EngineProductionYear;
    }

        protected boolean Engine() {
        if (EngineProductionYear > 2000) {

            if (EnginePower > 20000) {
                return  true;
            } else {
                return false;
            }
        } else {
            return  false;
        }
    }
    public boolean Eco (){ return this.EngineIsEcological; }



}
