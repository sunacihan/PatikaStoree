package com.company;

public abstract class Products extends Brands {
    Brands brand;
    private String productName;
    private int price;
    private int storage;
    private double screen;
    private int RAM;

    public Products(Brands brand, String id, String brandName, String productName, int price, int storage, double screen, int RAM) {
        super(id, brandName);
        this.brand = brand;
        this.productName = productName;
        this.price = price;
        this.storage = storage;
        this.screen = screen;
        this.RAM = RAM;
    }

    protected Products() {
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}
