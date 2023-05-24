package day06_Interface_OgretmenMenu;

import java.util.Scanner;

public class Ogretmen {
    private Scanner scanner = new Scanner(System.in);
    private String ad;
    private String soyad;
    private String tcNo;
    private int yas;
    private String bolum;
    private int sicilNo;


    @Override
    public String toString() {
        return "Ogretmen{ ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", yas=" + yas +
                ", bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo +
                '}';
    }

    public Ogretmen( String ad, String soyad, String tcNo, int yas, String bolum, int sicilNo) {

        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
        this.yas = yas;
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }
    public String getTcNo() {
        return tcNo;
    }

}
