package day06_Interface_OgretmenMenu;

import java.util.Scanner;

public class AnaMenu {
    Scanner scanner = new Scanner(System.in);
    OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri();
    OgretmenIslemleri ogretmenIslemleri = new OgretmenIslemleri();

    void menu() {

        System.out.println("====================================\n" +
                "     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "    ====================================\n" +
                "     1- ÖĞRENCİ İŞLEMLERİ\n" +
                "     2- ÖĞRETMEN İŞLEMLERİ\n" +
                "     Q- ÇIKIŞ\n" +
                "SEÇİMİNİZ: ");
        char secim = scanner.next().toUpperCase().charAt(0);
        switch (secim) {
            case '1': {
                ogrenciIslemleri.ogrenciMenu();
                break;
            }
            case '2': {
                ogretmenIslemleri.ogretmenMenu();
                break;
            }
            case 'Q': {
                System.exit(0);
                System.out.println("yine bekleriz...");
                break;
            }
            default:
                System.out.println("hatalı seçim yaptınız...");
                menu();
        }
    }


}
