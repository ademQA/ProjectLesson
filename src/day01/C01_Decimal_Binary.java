package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class C01_Decimal_Binary {
    public static void main(String[] args) {
        //1. SORU
        //    Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
        //        Örnek: 12 = 1 1 0 0


        Scanner scanner=new Scanner(System.in);
        System.out.println("decimal sayınızı giriniz: ");
        int sayi=scanner.nextInt();
        System.out.println("girilen ifadenin binary karşılığı: "+binaryConvert(sayi));
    }
    private static ArrayList<Integer> binaryConvert(int sayi){
        ArrayList<Integer>binaryList=new ArrayList<>();
        while (sayi>=1){
            binaryList.add(sayi%2);
            sayi/=2;
        }

        ArrayList<Integer>tersBinaryList=new ArrayList<>();
        for (int i =binaryList.size()-1 ; i >=0 ; i--) {
            tersBinaryList.add(binaryList.get(i));
        }
        return tersBinaryList;
    }
}
