package com.company;

public class Main {

    public static void main(String[] args) {
	User cat = new User("Sofiia", "Nalyvaiko", "sin@gmail.com", "18595978");
	User dog = new User("fluffy@gmail.com");
        dog.setLastname("Nalyvaiko");
        dog.setName("Sofiia");
        dog.setPassword("18595978");
        boolean Guest = dog.UserGuest();
        System.out.println(" guest: " + Guest);

        User three = new User("hhfuhf@gmail.com");
        Product PawOne = new Product("PawOne", 5000, 45, 0 );
        Product PawTwo = new Product("PawTwo", 1000, 46, 1);
        Product PawThree = new Product("PAwthree", 2000, 47, 3);

        PawTwo.setNumberOfPieces(0);
        long NumberOfPieces =  PawTwo.getNumberOfPieces();
        System.out.println("number of pices"  + NumberOfPieces);

        PawOne.setNumberOfPieces(9);
        PawThree.setPrice(40);
        double Price = PawThree.getPrice();
        double PawOneNumberOfPices = PawOne.getNumberOfPieces();
        System.out.println("Price " + Price + " " + " number of pieces " + PawOneNumberOfPices);




    }
}
