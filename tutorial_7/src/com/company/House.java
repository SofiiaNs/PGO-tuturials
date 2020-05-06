package com.company;

import java.util.ArrayList;
import java.util.List;

public class House {
        private String address;
        private List<Room> Rooms = new ArrayList<>();
        private static int roomsCount = 0;

        private House(String address) {
        this.address = address;
    }

        public House createHouse(String address) {
        return new House(address);
    }
        public void addRoom(Room room) {
        Rooms.add(room);
        roomsCount = Rooms.size();
    }

        public void addRooms(List<Room> rooms) {
        this.Rooms.addAll(rooms);
        roomsCount = rooms.size();
    }
         public int getRoomCount() {
        return Rooms.size();
    }
}
