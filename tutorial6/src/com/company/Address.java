package com.company;

public class Address {
    String Country;
    String City;
    double PostalCode;
    String Street;
    int Apartment;

    Address(String country, String city, double code, String street,int apartment){
        this.Country = country;
        this.City = city;
        this.PostalCode = code;
        this.Street = street;
        this.Apartment = apartment;
    }

    public Address(String america, String bermud, int i, String perfect) {
    }

    public String kotikovo(String country) {
        return String.format("country: "+ country);
    }
        public String kotikovo(String country, String city) {
        return String.format("America: " +country+ ", bermud: "+city);
    }
        public String kotikovo(String country, String city, int code) {
        return String.format("America: " +country+ ", bermud: " +city+ ", code: " +code);
    }
        public String kotikovo(String country, String city, int code, String street) {
        return String.format("America: " +country+ ", bermud: " +city+ ", postal code: " +code+ ", street:  " +street);
    }
        public String kotikovo(String country, String city, int code, String street, int apartment) {
        return String.format("America: " +country+ ", bermud: " +city+ ", postal code: " +code+ ", street:  " +street+ ", apartment: " +apartment);
    }
}

