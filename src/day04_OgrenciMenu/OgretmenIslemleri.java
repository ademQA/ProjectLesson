package day04_OgrenciMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class OgretmenIslemleri {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Ogretmen> ogretmenList = new ArrayList();
    //AnaMenu anaMenu=new AnaMenu();

    void ogretmenMenu() {
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
            case '0': {
                cikis();
                break;
            }
            default:
                System.out.println("Hatalı seçim yaptınız...");
                ogretmenMenu();
        }
    }

    private void cikis() {
        System.out.println("Değerli öğretmenimiz sizi tekrar bekleriz");
    }

    private void silme() {
        //İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili ekleme,
        // kimlik no ile silme ve arama,
        System.out.println("Silmek istediğiniz öğretmenin TC nosunu giriniz: ");
        String tcNo = scanner.next();
        int flag = 0;
        for (Ogretmen each : ogretmenList) {
            if (each.getTcNo().equals(tcNo)) {
                ogretmenList.remove(each);
                System.out.println("silme işlemi başarılı bir şekilde yapılmıştır.");
                flag++;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Aradığınız öğretmen yoktur");
            ogretmenMenu();
        } else
            ogretmenMenu();
    }


    private void listeleme() {
        for (Ogretmen each : ogretmenList) {
            System.out.println(each);

        }
        if (ogretmenList.isEmpty())
            System.out.println("Şuan listelenecek Öğretmen yoktur...");
        ogretmenMenu();
    }

    private void arama() {
        //İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili ekleme,
        // kimlik no ile silme ve arama,
        System.out.println("Aranacak öğretmenin TC nosunu giriniz: ");
        String tcNo = scanner.next();
        int flag = 0;
        for (Ogretmen each : ogretmenList) {
            if (each.getTcNo().equals(tcNo)) {
                System.out.println("Aradağınız öğretmen= " + each);
                flag++;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("Aradığınız öğretmen yoktur");
            ogretmenMenu();
        } else
            ogretmenMenu();
    }

    private void ekle() {
        System.out.println("Öğretmenin adını giriniz: ");
        String ad = scanner.next();
        System.out.println("Öğretmenin soyadını giriniz: ");
        String soyadad = scanner.next();
        System.out.println("Öğretmenin TC nosunu giriniz");
        String tcNo = scanner.next();
        System.out.println("Öğretmenin yaşını giriniz: ");
        int yas = scanner.nextInt();
        System.out.println("Öğretmenin bölümünü giriniz: ");
        String bolum = scanner.next();
        System.out.println("Öğretmenin Sicil Numarasını giriniz: ");
        int sicilNo = scanner.nextInt();
        Ogretmen ogretmen = new Ogretmen(ad, soyadad, tcNo, yas, bolum, sicilNo);
        ogretmenList.add(ogretmen);
        // listeleme();
        ogretmenMenu();

    }

}
