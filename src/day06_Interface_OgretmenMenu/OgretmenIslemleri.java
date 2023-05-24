package day06_Interface_OgretmenMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class OgretmenIslemleri implements Kisi{



        Scanner scanner = new Scanner(System.in);
        static ArrayList<Ogretmen> ogretmenList = new ArrayList();
        //AnaMenu anaMenu=new AnaMenu();

        void ogretmenMenu() {
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
                    break;
                }
                default:
                    System.out.println("Hatalı seçim yaptınız...");
                    ogretmenMenu();
            }
        }

    @Override
    public void ekle() {
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
        day06_Interface_OgretmenMenu.Ogretmen ogretmen = new day06_Interface_OgretmenMenu.Ogretmen(ad, soyadad, tcNo, yas, bolum, sicilNo);
        ogretmenList.add(ogretmen);
        ogretmenMenu();

    }


    @Override
    public void ara() {
        System.out.println("Aranacak öğretmenin TC nosunu giriniz: ");
        String tcNo = scanner.next();
        int flag = 0;
        for (day06_Interface_OgretmenMenu.Ogretmen each : ogretmenList) {
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

    @Override
    public void listele() {
        for (day06_Interface_OgretmenMenu.Ogretmen each : ogretmenList) {
            System.out.println(each);

        }
        if (ogretmenList.isEmpty())
            System.out.println("Şuan listelenecek Öğretmen yoktur...");
        ogretmenMenu();
    }

    @Override
    public void sil() {
        System.out.println("Silmek istediğiniz öğretmenin TC nosunu giriniz: ");
        String tcNo = scanner.next();
        int flag = 0;
        for (day06_Interface_OgretmenMenu.Ogretmen each : ogretmenList) {
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

    @Override
    public void cikis() {
        System.out.println("Değerli öğretmenimiz sizi tekrar bekleriz");
    }
}
