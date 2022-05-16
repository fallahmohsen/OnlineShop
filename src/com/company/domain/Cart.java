package com.company.domain;

public class Cart {
       private  String name;
       private  int id;
       private  String number;
       private  String price;

    public Cart() {
    }

    public Cart(String name, int id, String number, String price) {
        this.name = name;
        this.id = id;
        this.number = number;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
