package day04_OgrenciMenu;
// Öğrenci:  Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciIslemleri {

    Scanner scanner = new Scanner(System.in);
   static ArrayList<Ogrenci> ogrenciList = new ArrayList();
    //AnaMenu anaMenu=new AnaMenu();

    void ogrenciMenu() {
        System.out.println(" ============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         0-ÇIKIŞ\n" +
                "    SEÇİMİNİZ:");

        char secim = scanner.next().toUpperCase().charAt(0);
        switch (secim) {
            case '1': {
                ekle();
                break;
            }
            case '2': {
                arama();
                break;
            }
            case '3': {
                listeleme();
                break;
            }
            case '4': {
                silme();
                break;
            }
            case 'Q': {
              AnaMenu anaMenu=new AnaMenu();
              anaMenu.menu();
            }
            default:
                System.out.println("Hatalı seçim yaptınız: ");
                ogrenciMenu();
        }
    }

    private void cikis() {
        System.out.println("Değerli öğrencimiz sizi tekrar bekleriz");
    }

    private void silme() {
        //İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili ekleme,
        // kimlik no ile silme ve arama,
        System.out.println("Silmek istediğiniz öğrencinin TC nosunu giriniz: ");
        String tcNo = scanner.next();
        int flag = 0;
        for (Ogrenci each : ogrenciList) {
            if (each.getTcNo().equals(tcNo)) {
                ogrenciList.remove(each);
                System.out.println("silme işlemi başarılı bir şekilde yapılmıştır.");
                flag++;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Aradığınız öğrenci yoktur");
            ogrenciMenu();
        } else
            ogrenciMenu();
    }

    private void listeleme() {
        for (Ogrenci each : ogrenciList) {
            System.out.println(each);
        }
        if (ogrenciList.isEmpty())
            System.out.println("Şuan listelenecek öğrenci yoktur...");
        ogrenciMenu();
    }

    private void arama() {
        //İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili ekleme,
        // kimlik no ile silme ve arama,
        System.out.println("Aranacak öğrencinin TC nosunu giriniz: ");
        String tcNo = scanner.next();
        int flag = 0;
        for (Ogrenci each : ogrenciList) {
            if (each.getTcNo().equals(tcNo)) {
                System.out.println("Aradağınız Öğrenci= " + each);
                flag++;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Aradığınız öğrenci yoktur");
            ogrenciMenu();
        } else
            ogrenciMenu();
    }

    private void ekle() {
        System.out.println("Öğrencinin adını giriniz: ");
        String ad = scanner.next();
        System.out.println("Öğrencinin soyadını giriniz: ");
        String soyadad = scanner.next();
        System.out.println("Öğrencinin TC nosunu giriniz");
        String tcNo = scanner.next();
        System.out.println("Öğrencinin yaşını giriniz: ");
        int yas = scanner.nextInt();
        System.out.println("Öğrencinin numarasını giriniz: ");
        int no = scanner.nextInt();
        System.out.println("Öğrencinin sınıfını giriniz: ");
        String sinif = scanner.next();
        Ogrenci ogrenci = new Ogrenci(ad, soyadad, tcNo, yas, no, sinif);
        ogrenciList.add(ogrenci);
        ogrenciMenu();

    }


}
