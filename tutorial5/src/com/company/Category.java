package com.company;

import java.util.ArrayList;

public class Category {
    String name;
    ArrayList<String> Products ;

    public Category(){};

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<String> products) {
        Products = products;
    }

    public Category(String name, ArrayList<String> Product ) {
        this.name = name;
        this.Products = Products;
    }


    public void setProducts(String apple) {
    }
}