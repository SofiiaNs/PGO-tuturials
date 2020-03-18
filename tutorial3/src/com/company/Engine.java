package com.company;

public class Engine {
    int EngineProductionYear;
    double EnginePower;
    boolean EngineIsEcological;

    public Engine(int EngineProductionYear,int EnginePower){
        this.EngineProductionYear = EngineProductionYear;
        this.EnginePower = EnginePower;

    }

    public double getPower() {
        return this.EnginePower;
    }

    public void setPower(double Power) {
        this.EnginePower = EnginePower;
    }

    public int getProductionYear() {
        return this.EngineProductionYear;
    }

    public void setProductionYear(int EngineProductionYear) {
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
    public boolean getEcological (){ return this.EngineIsEcological; }



}
