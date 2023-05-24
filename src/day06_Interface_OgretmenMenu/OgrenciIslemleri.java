package day06_Interface_OgretmenMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciIslemleri implements Kisi{
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Ogrenci> ogrenciList = new ArrayList();
    //AnaMenu anaMenu=new AnaMenu();

    void ogrenciMenu() {
        System.out.println(" ============= İŞLEMLER =============\n" +
                "         1-EKLE\n" +
                "         2-ARA\n" +
                "         3-LİSTELE\n" +
                "         4-SİL\n" +
                "         Q-ÇIKIŞ\n" +
                "    SEÇİMİNİZ:");

        char secim = scanner.next().toUpperCase().charAt(0);
        switch (secim) {
            case '1': {
                ekle();
                break;
            }
            case '2': {
                ara();
                break;
            }
            case '3': {
                listele();
                break;
            }
            case '4': {
                sil();
                break;
            }
            case 'Q': {
                day06_Interface_OgretmenMenu.AnaMenu anaMenu=new AnaMenu();
                anaMenu.menu();
            }
            default:
                System.out.println("Hatalı seçim yaptınız: ");
                ogrenciMenu();
        }
    }

    @Override
    public void ekle() {
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
        day06_Interface_OgretmenMenu.Ogrenci ogrenci = new day06_Interface_OgretmenMenu.Ogrenci(ad, soyadad, tcNo, yas, no, sinif);
        ogrenciList.add(ogrenci);
        ogrenciMenu();
    }

    @Override
    public void ara() {
        System.out.println("Aranacak öğrencinin TC nosunu giriniz: ");
        String tcNo = scanner.next();
        int flag = 0;
        for (day06_Interface_OgretmenMenu.Ogrenci each : ogrenciList) {
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

    @Override
    public void listele() {
        for (day06_Interface_OgretmenMenu.Ogrenci each : ogrenciList) {
            System.out.println(each);
        }
        if (ogrenciList.isEmpty())
            System.out.println("Şuan listelenecek öğrenci yoktur...");
        ogrenciMenu();
    }

    @Override
    public void sil() {
        System.out.println("Silmek istediğiniz öğrencinin TC nosunu giriniz: ");
        String tcNo = scanner.next();
        int flag = 0;
        for (day06_Interface_OgretmenMenu.Ogrenci each : ogrenciList) {
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

    @Override
    public void cikis() {
        System.out.println("Değerli öğrencimiz sizi tekrar bekleriz");
    }
}
