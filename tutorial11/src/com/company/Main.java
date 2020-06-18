package com.company;
import java.util.*;

public class Main {

    private static int[] intArray = new int[10];

    public static void main(String[] args) {

    }

    private static void firstTaskExecute() {


        Car c1 = new Car(2000, "Ferrari");
        Car c2 = new Car(2002, "Bugatti");
        Car c3 = new Car(2016, "Ford");
        Car c4 = new Car(2015, "Porshe");
        Car c5 = new Car(2017, "Audi");
        Car c6 = new Car(2018, "Mustang");
        Car c7 = new Car(2019, "Lambo");
        Car c8 = new Car(2010, "BMW");
        Car c9 = new Car(2020, "Lada");
        Car c10 = new Car(2007, "Toyota");
        List<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);

        System.out.println("sorting");
        for (Car car : cars) {
            System.out.println(car);
        }

        Collections.sort(cars);
        System.out.println("sorted");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static void secondTaskExecute() {
        Item i1 = new Item("phone", 7274685);
        Item i2 = new Item("tv", 847583);
        Item i3 = new Item("laptop", 4758969);
        Item i4 = new Item("t-shirt", 7374859);
        Item i5 = new Item("tea", 889586);
        Item i6 = new Item("watch", 748596);

        List<Item> items = new ArrayList<>();
        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);
        items.add(i6);

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }
        Map<Integer, String> map = new HashMap();
        for (Item item : items) {
            map.put(item.getID(), item.getName());
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }

        public static void fourthTaskExecute() {
        fillArray();
    }
        private static int readNumber() throws NegativeNumberException {
        System.out.println("number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("not negative");
        } else {
            return number;
        }
    }
              private static void fillArray() {
              for (int i = 0; i < intArray.length; i++) {
              try {
                intArray[i] = readNumber();
            } catch (NegativeNumberException e) {
                intArray[i] = 0;
                e.printStackTrace();
            }
        }
              System.out.println("chosen value:");
              for (int i = 0; i < intArray.length; i++) {
              System.out.println(intArray[i]);
        }
    }
    private static void thirdTaskExecute() {
        Item item1 = new Item("hat", 74885);
        Item item2 = new Item("glasses", 74858);
        Item item3 = new Item("nail", 84959);
        Item item4 = new Item("jacket", 23456);
        Item item5 = new Item("camera", 66485);
        Item item6 = new Item("toy", 90865);
        Item item7 = new Item("keys", 459695);
        Item item8 = new Item("cake", 849596);
        Item item9 = new Item("carpet", 24966);
        Item item10 = new Item("earings", 128576);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);
        items.add(item10);
        List<Item> subList = items.subList(4, 20);
        Set<Item> itemSet = new HashSet<>(subList);

        for (Item item : itemSet) {
            System.out.println(item.getName());
        }
    }
}





