package com.company.domain;

public class Products {
    private int id;
    private String category;
    private String nameProducts;
    private int inventory;
    private int price;

    public Products() {
    }

    public Products(int id, String category, String nameProducts, int inventory, int price) {
        this.id = id;
        this.category = category;
        this.nameProducts = nameProducts;
        this.inventory = inventory;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNameProducts() {
        return nameProducts;
    }

    public void setNameProducts(String nameProducts) {
        this.nameProducts = nameProducts;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


