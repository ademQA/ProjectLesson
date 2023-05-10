package day04_OgrenciMenu;
// Öğrenci:  Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
public class Ogrenci extends Kisi{
    private int numara;
    private String sinif;
    @Override
    public String toString() {
        return "Ogrenci{" +super.toString()+
                "numara=" + numara +
                ", sinif='" + sinif + '\'' +
                '}';
    }

    public Ogrenci(String ad, String soyad, String tcNo, int yas, int numara, String sinif) {
        super(ad, soyad, tcNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public Ogrenci() {

    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }


}
