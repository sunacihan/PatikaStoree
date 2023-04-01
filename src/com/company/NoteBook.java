package com.company;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.UUID;

public class NoteBook extends Products {
   TreeSet<NoteBook> noteBooksList = new TreeSet<>(new ComparatorNoteBookName());

    public NoteBook() {
    }
    {
        addNoteBook();
    }

    public NoteBook(Brands brand, String id, String brandName, String productName, int price, int storage, double screen, int RAM) {
        super(brand, id, brandName, productName, price, storage, screen, RAM);
    }


    public void addNoteBook() {
        noteBooksList.add(new NoteBook(controlBrand("Huawei"), "111", "Huawei Matebook", "Huawei Matebook 14", 7000, 512, 14.4, 128));
        noteBooksList.add(new NoteBook(controlBrand("Lenovo"), "222", "Lenovo b14", "Lenovo V14 IGL", 5000, 400, 9.4, 64));

    }
    public void menuNoteBook() {
        System.out.println("NoteBook Menü");
        System.out.println("--------------");
        System.out.println("1 - Markaları Görüntüle");
        System.out.println("2 - NoteBookları görüntüle");
        System.out.println("3 - NoteBook Ekle");
        System.out.println("4 - NoteBook Sil");
        System.out.println("0 - Çıkış yap");

    }
    public void printNoteBook(){
        for (NoteBook nb: noteBooksList
             ) {
            System.out.println(nb.getProductName());
        }
    }



}




