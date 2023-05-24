package day06_Interface_OgretmenMenu;

import java.util.Scanner;

public class Ogrenci {
    static Scanner scanner = new Scanner(System.in);
    private String ad;
    private String soyad;

    public String getTcNo() {
        return tcNo;
    }

    private String tcNo;
    private int yas;
    private int numara;
    private String sinif;

    public Ogrenci(String ad, String soyad, String tcNo, int yas, int numara, String sinif) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
        this.yas = yas;
        this.numara = numara;
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", yas=" + yas +
                ", numara=" + numara +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
