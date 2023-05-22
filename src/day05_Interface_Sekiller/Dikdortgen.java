package day05_Interface_Sekiller;

import java.util.Scanner;

public class Dikdortgen implements Iislemler {
    static Scanner scanner = new Scanner(System.in);
    static int kisaKenar, uzunKenar, cevre, alan;

    @Override
    public void cevre() {
        System.out.println("Kısa kenar uzunluğu giriniz: ");
        kisaKenar = scanner.nextInt();
        System.out.println("Uzun kenar uzunluğu giriniz: ");
        uzunKenar = scanner.nextInt();
        cevre = 2 * (kisaKenar + uzunKenar);
        System.out.println("Dikdörtgenin çevresi: " + cevre);
    }

    @Override
    public void alan() {
        alan = uzunKenar * kisaKenar;
        System.out.println("Dikdörtgenin Alanı: " + alan);
    }
}
