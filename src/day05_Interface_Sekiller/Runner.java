package day05_Interface_Sekiller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("Hesaplamak istediğiniz Geometrik şekli seçiniz: \n" +
                "1. Dikdörtgen\n" +
                "2. Kare\n" +
                "3. Daire\n" +
                "Çıkış için Q harfine basınız...");

        try {
            int secim = scanner.nextInt();
            switch (secim) {
                case 1: {
                    Dikdortgen dikdortgen = new Dikdortgen();
                    dikdortgen.cevre();
                    dikdortgen.alan();
                    menu();
                }
                case 2: {
                    Kare kare = new Kare();
                    kare.cevre();
                    kare.alan();
                    menu();
                }
                case 3: {
                    Daire daire = new Daire();
                    daire.cevre();
                    daire.alan();
                    menu();
                }
                default: {
                    System.out.println("Hatalı giriş yaptınız...");
                    menu();
                }

            }

        } catch (InputMismatchException e) {
            char secim = scanner.next().toUpperCase().charAt(0);
            if (secim == 'Q') {
                System.out.println("Çıkış yapılıyor...");
                System.exit(0);
            } else {
                System.out.println("Hatalı giriş yaptınız...");
                menu();
            }
        }
    }


}
