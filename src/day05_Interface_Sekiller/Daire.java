package day05_Interface_Sekiller;

import java.util.Scanner;

public class Daire implements Iislemler {
    static Scanner scanner = new Scanner(System.in);
    static double yaricap, cevre, alan;

    @Override
    public void cevre() {
        System.out.println("Dairenin yaricap uzunluğu giriniz: ");
        yaricap = scanner.nextInt();
        cevre = 2 * Math.PI * yaricap;
        System.out.println("Dairenin çevresi: " + cevre);
    }

    @Override
    public void alan() {
        alan = (Math.PI) * (Math.pow(yaricap, 2));
        System.out.println("Dairenin Alanı: " + alan);
    }
}
