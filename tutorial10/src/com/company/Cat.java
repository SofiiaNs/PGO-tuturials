package com.company;

public class Cat extends Animal implements Moveable  {


        public Cat(String Name) {
        super(Name);
    }
        @Override
        public void start() {
        System.out.println("Start");
    }
        @Override
        public void stop() {
        System.out.println("Stop");
    }
        @Override
        String getType() {
        String Type = "Cat say mew";
        return Type;
    }
}
