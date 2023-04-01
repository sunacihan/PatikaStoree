package com.company;

public class MobilPhone extends Products {

private int camera;
private int battery;
private String color;

    public MobilPhone(Brands brand, String id, String brandName, String productName, int price, int storage, double screen, int RAM, int camera, int battery, String color) {
        super(brand, id, brandName, productName, price, storage, screen, RAM);
        this.camera = camera;
        this.battery = battery;
        this.color = color;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
