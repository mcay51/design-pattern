package tr.com.mustafacay.bridge.odemesistemi.service;

// Refined Abstraction (Kredi Kartı Ödemesi)
public class KrediKartiOdeme extends Odeme {
    public KrediKartiOdeme(Banka banka, double tutar) {
        super(banka, tutar);
    }

    @Override
    public void islemiGerceklestir() {
        System.out.println("Kredi Kartı ile ödeme başlatıldı.");
        banka.odemeYap(tutar);
    }
}
