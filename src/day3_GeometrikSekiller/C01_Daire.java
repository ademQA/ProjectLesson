package day3_GeometrikSekiller;

import java.util.Scanner;

public class C01_Daire {
    Scanner scanner=new Scanner(System.in);
    void cevre(){
        System.out.println("dairenin yarıcapını giriniz: ");
        int r=scanner.nextInt();
        System.out.println("dairenin cevresi: "+2*3.14*r);
    }
    void alan(){
        System.out.println("dairenin yarıcapını giriniz: ");
        int r=scanner.nextInt();
        System.out.println("dairenin alanı: "+3.14*r*r);
    }
}
