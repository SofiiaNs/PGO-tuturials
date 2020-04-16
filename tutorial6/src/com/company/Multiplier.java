package com.company;

import java.math.BigDecimal;
import java.util.List;

public class Multiplier {

    int a;
    int b;

    Multiplier(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int multiply(int a, int b) {

        return a * b;
    }

    public int multiply(int a, int b, int e, int f) {

        return a * b * e * f;
    }

    public double multiply(double a, double b) {

        return a * b;
    }

    public int multiply(List<Integer> a) {
        int t = 1;
        for (int i = 0; i < a.size(); i++) {
            t = t * a.get(i);
        }
        return t;
    }

    public BigDecimal mutiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
}