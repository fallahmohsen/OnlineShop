package com.company.domain;

public class Basket {

       private  int id;
       private  int numberPurchases;
       private  int price;
       private String nameProduct;

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", numberPurchases=" + numberPurchases +
                ", price=" + price +
                ", nameProduct='" + nameProduct + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Basket(int id) {
        this.price = price;
    }

    public Basket(int id, int numberPurchases, int price, String nameProduct) {
        this.id = id;
        this.numberPurchases = numberPurchases;
        this.price = price;
        this.nameProduct = nameProduct;
    }
    public int getNumberPurchases() {
        return numberPurchases;
    }

    public void setNumberPurchases(int numberPurchases) {
        this.numberPurchases = numberPurchases;
    }

    public Basket(){
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
