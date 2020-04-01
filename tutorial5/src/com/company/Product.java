package com.company;

public class Product {
    String Name;
    double Price;
    int ProductCode;
    int NumberOfItems;

    public Product(String name, double price, int productCode, int numberOfItems) {
        Name = name;
        this.Price = price;
        this.ProductCode = productCode;
        this.NumberOfItems = numberOfItems;
    }
    Product milk = new Product("milk",10,10,10);

    public Product(String name) {
        this.Name = name;
    }
    Product Milk = new Product ("milk", 10, 10, 10);
    Product Potato = new Product("potato",9,9,9);


    public String getName() {
        return Name;
     }
        public void setName(String name) {
        Name = name;
       }
        public double getPrice() {
        return Price;
       }
       public void setPrice(double price) {
        this.Price = price;
       }
        public int getProductCode() {
          return ProductCode;
       }
       public void setProductCode(int productCode) {
        ProductCode = productCode;
      }
        public int getNumberOfItems() {
        return NumberOfItems;
      }
    public void setNumberOfItems(int numOfItems) {
        NumberOfItems = numOfItems;
    }





}


