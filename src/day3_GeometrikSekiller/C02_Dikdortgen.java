package day3_GeometrikSekiller;

import java.util.Scanner;

public class C02_Dikdortgen {
    Scanner scanner=new Scanner(System.in);
    void cevre(){
        System.out.println("kısa kenarı giriniz: ");
        int kKenar=scanner.nextInt();
        System.out.println("uzun kenarı giriniz: ");
        int uKenar=scanner.nextInt();
        System.out.println("dikdörtgenin cevresi: "+2*(kKenar+uKenar));
    }
    void alan(){
        System.out.println("kısa kenarı giriniz: ");
        int kKenar=scanner.nextInt();
        System.out.println("uzun kenarı giriniz: ");
        int uKenar=scanner.nextInt();
        System.out.println("dikdörtgenin alanı : "+kKenar*uKenar);
    }
}
