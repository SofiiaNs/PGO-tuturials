package com.company;

import java.util.ArrayList;
import java.util.List;

        public class Room {
        private double Area;
        private final List<Furniture> FurnitureList;

        public Room(double area, List<Furniture> furnitureList) {
        this.Area = area;
        this.FurnitureList = furnitureList;
    }

        public double getArea() {
        return Area;
    }
        public double getFurnitureListPrice() {
        double allPrice = 0;
        for (Furniture furniture: FurnitureList) {
            allPrice += furniture.getVatPrice();
        }
        return allPrice;
    }
}
