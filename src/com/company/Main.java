package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);



        List<MobilPhone> MobilPhone = new ArrayList<>();
      //  MobilPhone.add(new MobilPhone(1, "SAMSUNG GALAXY A51", 3199, "SAMSUNG", 128, 6.5, 6, 32, 4000, "Siyah"));
        //MobilPhone.add(new MobilPhone(2, "iPhone 11 64 GB", 7379, "Apple", 64, 6.1, 6, 5, 3046, "Mavi"));
        //MobilPhone.add(new MobilPhone(3, "Redmi Note 10 Pro 8GB", 4012, "Xiaomi", 128, 6.5, 12, 35, 4000, "Beyaz"));





        System.out.println("Patika Store Ürün Yönetim Paneli!");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çıkış Yap");
        System.out.print("Tercihiniz : ");
        int tercih = scan.nextInt();

        switch (tercih) {
            case 1:
                NoteBook nb=new NoteBook();
                nb.menuNoteBook();
                nb.printNoteBook();



                break;
            case 2:

                break;
            case 3:
                Brands brand = new Brands();
                System.out.println("Markalarımız");
                System.out.println("------------");

                brand.printBrand();

                break;
            case 0:

                break;
            default:

        }


    }
}
