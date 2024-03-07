package tr.com.mustafacay.composite;

import tr.com.mustafacay.composite.service.Kutu;
import tr.com.mustafacay.composite.service.Urun;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Composite Design Pattern");
        // Ürünler oluşturulur
        Urun urun1 = new Urun("Kalem", 2.5);
        Urun urun2 = new Urun("Defter", 5.0);

        // Kutular oluşturulur
        Kutu kutu1 = new Kutu("Kutu 1");
        Kutu kutu2 = new Kutu("Kutu 2");

        // Kutulara ürünler eklenir
        kutu1.icerikEkle(urun1);
        kutu1.icerikEkle(urun2);
        kutu2.icerikEkle(urun1);
        kutu2.icerikEkle(kutu1);

        // Kutuların içeriği ve fiyatları hesaplanır
        double kutu1Fiyat = kutu1.fiyatHesapla();
        double kutu2Fiyat = kutu2.fiyatHesapla();

        // Sonuçlar yazdırılır
        System.out.println(kutu1);
        System.out.println("Kutu 1 Toplam Fiyat: " + kutu1Fiyat);
        System.out.println();

        System.out.println(kutu2);
        System.out.println("Kutu 2 Toplam Fiyat: " + kutu2Fiyat);
    }
}