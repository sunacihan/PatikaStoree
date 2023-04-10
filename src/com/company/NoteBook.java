package com.company;

import java.util.TreeSet;
import java.util.UUID;

public class NoteBook extends Products {

    TreeSet<NoteBook> noteBooksList = new TreeSet<>(new ComparatorNoteBookName());
    public NoteBook(){}


    public NoteBook(Brands brand, String id, String brandName, String productName, int price, int storage, double screen, int RAM) {
        super(brand, id, brandName, productName, price, storage, screen, RAM);
    }


    public void addNoteBook() {
        noteBooksList.add(new NoteBook(controlBrand("Huawei"), UUID.randomUUID().toString(), "Huawei", "Huawei Matebook 14", 7000, 512, 14.4, 128));
        noteBooksList.add(new NoteBook(controlBrand("Lenovo"), UUID.randomUUID().toString(), "Lenovo", "Lenovo V14 IGL", 5000, 400, 9.4, 64));

    }

    public void menuNoteBook(Brands brands) {
        addNoteBook();
        System.out.println("NoteBook Menü");
        System.out.println("--------------");
        System.out.println("1 - Markaları Görüntüle");
        System.out.println("2 - NoteBookları görüntüle");
        System.out.println("3 - NoteBook Ekle");
        System.out.println("4 - NoteBook Sil");
        System.out.println("0 - Çıkış yap");
        System.out.println("---------------");
        System.out.print("Tercihiniz : ");
        int tercih = scan.nextInt();

        switch (tercih) {
            case 1:
                printNoteBookBrand();
                break;
            case 2:
                printNoteBook();
                break;
            case 3:
                addNoteBookNew(brands);
                break;
            case 4:
                System.out.print("Silmek istediğiniz ürün ismi :");
                String urunSil = scan.next();
                noteBooksList.removeIf(nb -> nb.getBrand().getBrandName().equals(urunSil));
                break;
            case 0:
                Main.run();
                break;
            default:
                System.out.println("Lütfen verilen değerler aralığında bir değer girin !");

        }
     menuNoteBook(brands);

    }

    public void addNoteBookNew(Brands brands){

        brands.printBrand();
        String bName =  selectBrand();

        System.out.print("Ürün İsmi :");
        String pName=scan.next();

        System.out.print("Fiyatı :");
        int pricee=scan.nextInt();

        System.out.print("Depolama :");
        int storage=scan.nextInt();

        System.out.print("Ekran :");
        double screen=scan.nextInt();

        System.out.print("RAM :");
        int ram=scan.nextInt();

        noteBooksList.add(new NoteBook( controlBrand(bName),UUID.randomUUID().toString(), bName, pName, pricee, storage, screen, ram));
    }

    public void printNoteBookBrand() {

        System.out.println("--------------------------");
        System.out.println("*** NoteBook Markaları ***");
        for (NoteBook nb : noteBooksList
        ) {
            System.out.println(nb.getBrandName());
        }
    }

    public void printNoteBook() {
        System.out.println("*** NoteBook İsimleri ***");
        for (NoteBook nb : noteBooksList
        ) {
            System.out.println("NoteBook Name :" + nb.getProductName());
        }
    }


}




