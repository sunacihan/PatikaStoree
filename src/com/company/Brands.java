package com.company;


import java.util.*;

public class Brands {
    Scanner scan = new Scanner(System.in);
    private String id;
    private String brandName;
    TreeSet<Brands> brand = new TreeSet<>(new ComparatorBrandName());

    public Brands() {

    }

    public Brands(String id, String brandName) {
        this.id = id;
        this.brandName = brandName;

    }


    public Brands controlBrand(String name) {

        for (Brands b : brand) {
            if (name.equals(b.getBrandName())) return b;
        }

        Brands brandd = new Brands(UUID.randomUUID().toString(), name);
        brand.add(brandd);
        return brandd;
    }

    public void addBrandName() {

        brand.add(new Brands(UUID.randomUUID().toString(), "Samsung"));
        brand.add(new Brands(UUID.randomUUID().toString(), "Lenovo"));
        brand.add(new Brands(UUID.randomUUID().toString(), "Apple"));
        brand.add(new Brands(UUID.randomUUID().toString(), "Huawei"));
        brand.add(new Brands(UUID.randomUUID().toString(), "Casper"));
        brand.add(new Brands(UUID.randomUUID().toString(), "Asus"));
        brand.add(new Brands(UUID.randomUUID().toString(), "HP"));
        brand.add(new Brands(UUID.randomUUID().toString(), "Xiaomi"));
        brand.add(new Brands(UUID.randomUUID().toString(), "Monster"));

    }

    public void printBrand() {
        int i = 1;
        for (Brands b : brand) {
            System.out.println(i + ". Marka :" + b.getBrandName());
            i++;
        }

    }

    public String selectBrand() {

        System.out.println("-------------");
        System.out.println("Marka seçin :");
        int tercih = scan.nextInt();
        String selectBrand = "";
        switch (tercih) {
            case 1:
                selectBrand = "Apple";
                return selectBrand;
            case 2:
                selectBrand = "Asus";
                return selectBrand;

            case 3:
                selectBrand = "Casper";
                return selectBrand;

            case 4:
                selectBrand = "HP";
                return selectBrand;

            case 5:
                selectBrand = "Huawei";
                return selectBrand;

            case 6:
                selectBrand = "Lenovo";
                return selectBrand;

            case 7:
                selectBrand = "Monster";
                return selectBrand;

            case 8:
                selectBrand = "Samsung";
                return selectBrand;

            case 9:
                selectBrand = "Xiaomi";
                return selectBrand;

            default:
                System.out.println("Lütfen verilen değerler aralığında bir değer girin !");

        }
        return selectBrand;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setName(String name) {
        this.brandName = name;
    }

}
