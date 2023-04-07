package com.company;

import java.util.*;


public class Main {


    public static void run() {
        Brands brand = new Brands();
        brand.addBrandName();
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Patika Store Ürün Yönetim Paneli!");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çıkış Yap");
        System.out.print("Tercihiniz : ");
        int tercih = scan.nextInt();

        switch (tercih) {
            case 1:
                NoteBook nb = new NoteBook();
                nb.menuNoteBook(brand);
                break;
            case 2:
                MobilPhone mp=new MobilPhone();
                mp.menuMobilPhone();

                break;
            case 3:
                System.out.println("Markalarımız");
                System.out.println("------------");
                brand.printBrand();
                break;
            case 0:
                System.exit(0);

                break;
            default:
                System.out.println("Lütfen verilen değerler aralığında bir değer girin !");
        }
        run();
    }


    public static void main(String[] args) {

        run();




    }
}
