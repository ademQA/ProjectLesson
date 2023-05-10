package day04_OgrenciMenu;
//Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
public class Ogretmen extends Kisi{
    private String bolum;
    private int sicilNo;

    public Ogretmen(String ad, String soyad, String tcNo, int yas, String bolum, int sicilNo) {
        super(ad, soyad, tcNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }
    public Ogretmen(){

    }

    @Override
    public String toString() {
        return "Ogretmen " +super.toString()+
                "bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo
                ;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }
}
