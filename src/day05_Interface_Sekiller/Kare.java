package day05_Interface_Sekiller;

import java.util.Scanner;

public class Kare implements Iislemler {
    Scanner scanner = new Scanner(System.in);
   static int kenar, cevre, alan;

    @Override
    public void cevre() {
        System.out.println(" kenar uzunluğunu giriniz: ");
        kenar = scanner.nextInt();
        cevre = 4 * kenar;
        System.out.println("Karenin çevresi: " + cevre);
    }

    @Override
    public void alan() {
        alan = kenar * kenar;
        System.out.println("Karenin Alanı: " + alan);

    }
}
