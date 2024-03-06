package tr.com.mustafacay.facade.service;

public class Kredi {
    public void krediKullan(Musteri musteri, double miktar) {
        // Kredi kullanma işlemi gerçekleştirilir
        System.out.println(musteri.getAd() + " " + miktar + " TL kredi kullanıyor.");
    }
}
