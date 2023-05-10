package day04_OgrenciMenu;
//Öğretmen: Ad-Soyad,  kimlik No, yaş
//Öğrenci:  Ad-Soyad,  kimlik No, yaş
public class Kisi {
    private String ad;
    private String soyad;
    private String tcNo;
    private int yas;

    public Kisi() {
    }

    public Kisi(String ad, String soyad, String tcNo, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi: " +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", yas=" + yas
                ;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
