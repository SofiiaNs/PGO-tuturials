package com.company;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Address nowyj = new Address("America", "bermud",2345, "Perfect", 13);
        System.out.println(nowyj);
        Adder adder = new Adder(12, 4);
        adder.add(2,4 );
        System.out.println(adder.add(12,45));

        ArrayList<BigDecimal> bigDecimal = new ArrayList<BigDecimal>(2);
        BigDecimal totalPopulatoin = new BigDecimal(46765456);
        BigDecimal cityPopulatoin = new BigDecimal(46756);
        bigDecimal.add(totalPopulatoin);
        bigDecimal.add(cityPopulatoin);
        Adder.add1(bigDecimal);





    }
}
