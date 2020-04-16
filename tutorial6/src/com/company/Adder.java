package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Adder {
    int a;
    int b;

    Adder(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void add(int i, int i1, int i2) {
    }

    public int add(int a, int b) {

        return a + b;
    }
    public static void add1(ArrayList<BigDecimal> bigDecimals){
        System.out.println("BigDecimal Objects: ");
         for(BigDecimal i : bigDecimals){
             System.out.println(i);
         }

    }

    public BigDecimal add(BigDecimal a, BigDecimal b) {

        return a.add(b);
    }
}