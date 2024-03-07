package tr.com.mustafacay.composite.service;

/**
 * Leaf Class: Basit ürünleri temsil eder.
  */
public class Urun implements Fiyatlanabilir {
    private String ad;
    private double fiyat;

    public Urun(String ad, double fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }

    @Override
    public double fiyatHesapla() {
        return fiyat;
    }

    public String toString() {
        return ad + " - Fiyat: " + fiyat;
    }
}