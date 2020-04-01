package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Category WhatToEat = new Category();
        Category Drink = new Category("Milk");
        Category Eat = new Category("Potato", new ArrayList<>());
        Drink.setProducts("milk");
        Eat.setProducts("diet");
        WhatToEat.setProducts("nudeles");
        Busket first = new Busket();
        Busket second = new Busket("full");








    }
}