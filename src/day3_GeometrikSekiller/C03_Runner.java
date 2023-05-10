package day3_GeometrikSekiller;

import java.util.Scanner;

public class C03_Runner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("geometrik şekil seciniz: \n" +
                "1.dikdortgen\n" +
                "2.daire");
        int secim=scanner.nextInt();
        switch (secim){
            case 1: {
                C02_Dikdortgen obj = new C02_Dikdortgen();
                obj.alan();
                obj.cevre();
                break;
            }
            case 2:{
                C01_Daire obj1 = new C01_Daire();
                obj1.alan();
                obj1.cevre();
                break;

            }
        }

    }


}
