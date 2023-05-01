package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C02_Manav_Urun_Listesi {
    static List<String>urunListesi=new ArrayList<>(Arrays.asList("Domates","Salatalık","Muz","Soğan","Patates"));
   static List<Integer>fiyatListesi=new ArrayList<>(Arrays.asList(20,20,18,25,15));
   static Scanner scanner=new Scanner(System.in);
   static double tutar=0;

    public static void main(String[] args) {

        //2. SORU
        //        Basit bir 5 ürünlü manav alisveris programi yaziniz.
        //        1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
        //        2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster,
        //        istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
        //        3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
        //        4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        System.out.println("*******MÜJDE MARKET*********");
        menu();

    }
    private static void menu(){
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i+". ürün: "+urunListesi.get(i-1)+" fiyatı: "+fiyatListesi.get(i-1));
        }
        System.out.println("seçmek istediğiniz ürünün kodunu giriniz: ");
        int urun=scanner.nextInt();

        System.out.println("miktar giriniz: ");
        double miktar=scanner.nextDouble();
        tutar+=miktar*fiyatListesi.get(urun-1);
        System.out.println("alış verişe devam etmek istiyormusunuz? E/H");
        char secim=scanner.next().toUpperCase().charAt(0);
        if (secim == 'E') {
            menu();
        }else {
            System.out.println("Ödenecek tutar: "+ tutar);
        }
    }
    }

