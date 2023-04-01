package com.company;


import java.util.*;

public class Brands {

    private String id;
    private String brandName;
    static TreeSet<Brands> brand = new TreeSet<>(new ComparatorBrandName());
public Brands(){}

    public Brands(String id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    static {
        addBrandName();
    }

    public static Brands controlBrand(String name) {

        for (Brands b : brand) {
            if (name.equals(b.getName())) return b;
        }

        Brands brandd = new Brands(UUID.randomUUID().toString(), name);
        brand.add(brandd);
        return brandd;
    }

    public static void addBrandName() {

        brand.add(new Brands("UUID.randomUUID().toString()", "Samsung"));
        brand.add(new Brands("123", "Lenovo"));
        brand.add(new Brands(UUID.randomUUID().toString(), "Apple"));
        brand.add(new Brands("1234", "Huawei"));
        brand.add(new Brands(UUID.randomUUID().toString(), "Casper"));
        brand.add(new Brands(UUID.randomUUID().toString(), "Asus"));
        brand.add(new Brands(UUID.randomUUID().toString(), "HP"));
        brand.add(new Brands(UUID.randomUUID().toString(), "Xaomi"));
        brand.add(new Brands(UUID.randomUUID().toString(), "Monster"));

    }

    public void printBrand() {
        for (Brands b : brand) {
            System.out.println(b.getName());
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return brandName;
    }

    public void setName(String name) {
        this.brandName = name;
    }

}
