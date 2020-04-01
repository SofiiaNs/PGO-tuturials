package com.company;

import java.util.ArrayList;

public class Busket {

    String Name;
    ArrayList<Product> Product;

    public Busket(){}
    public Busket(String name) {
        Name = name;
      }
        public Busket(String name, ArrayList<com.company.Product> product) {
        Name = name;
        Product = product;
      }
        public String getName() {
        return Name;
      }
        public void setName(String name) {
        Name = name;
    }
        public ArrayList<com.company.Product> getProduct() {
        return Product;
      }
       public void setProduct(ArrayList<com.company.Product> product) {
        Product = product;
    }





}

