package com.company;

import java.util.TreeSet;
import java.util.UUID;

public class MobilPhone extends Products {

    private int camera;
    private int battery;
    private String color;
    TreeSet<MobilPhone> mobilPhoneList = new TreeSet<>(new ComparatorMobilPhoneName());

    public MobilPhone() {
    }

    public MobilPhone(Brands brand, String id, String brandName, String productName, int price, int storage, double screen, int RAM, int camera, int battery, String color) {
        super(brand, id, brandName, productName, price, storage, screen, RAM);
        this.camera = camera;
        this.battery = battery;
        this.color = color;
    }

    public void addMobilPhone() {
        mobilPhoneList.add(new MobilPhone(controlBrand("Huawei"), UUID.randomUUID().toString(), "Huawei", "Huawei Pat12", 8000, 1000, 5.6, 516, 32, 4000, "Mavi"));
    }

    public void menuMobilPhone(Brands brands) {
        addMobilPhone();
        System.out.println("----------------");
        System.out.println("Cep Telefon Menü");
        System.out.println("--------------");
        System.out.println("1 - Markaları Görüntüle");
        System.out.println("2 - Cep Telefonlarını görüntüle");
        System.out.println("3 - Cep Telefonu Ekle");
        System.out.println("4 - Cep Telefonu Sil");
        System.out.println("0 - Çıkış yap");
        System.out.println("---------------");
        System.out.print("Tercihiniz : ");
        int tercih = scan.nextInt();

        switch (tercih) {
            case 1:
                printMobilPhoneBrand();
                break;
            case 2:
                printMobilPhone();
                break;
            case 3:
                addMobilPhoneNew(brands);
                break;
            case 4:
                System.out.print("Silmek istediğiniz ürün ismi :");
                String urunSil = scan.next();
                mobilPhoneList.removeIf(nb -> nb.getBrand().getBrandName().equals(urunSil));
                break;
            case 0:
                Main.run();
                break;
            default:
                System.out.println("Lütfen verilen değerler aralığında bir değer girin !");

        }
        menuMobilPhone(brands);

    }

    public void addMobilPhoneNew(Brands brands) {
        brands.printBrand();
        String bName =  selectBrand();

        System.out.print("Ürün İsmi :");
        String pName = scan.next();

        System.out.print("Fiyatı :");
        int pricee = scan.nextInt();

        System.out.print("Depolama :");
        int storage = scan.nextInt();

        System.out.print("Ekran :");
        double screen = scan.nextInt();

        System.out.print("RAM :");
        int ram = scan.nextInt();

        System.out.print("Kamera :");
        int camera = scan.nextInt();

        System.out.print("Pil :");
        int battery = scan.nextInt();

        System.out.print("Renk :");
        String color = scan.next();

        mobilPhoneList.add(new MobilPhone(controlBrand(bName), UUID.randomUUID().toString(), bName, pName, pricee, storage, screen, ram, camera, battery, color));
    }

    public void printMobilPhoneBrand() {
        System.out.println("--------------------------");
        System.out.println("*** Cep Telefonu Markaları ***");
        for (MobilPhone mp : mobilPhoneList
        ) {
            System.out.println(mp.getBrandName());
        }
    }

    public void printMobilPhone() {
        System.out.println("*** NoteBook İsimleri ***");
        for (MobilPhone mp : mobilPhoneList
        ) {
            System.out.println("Cep Telefonu isim :" + mp.getProductName());
        }
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
