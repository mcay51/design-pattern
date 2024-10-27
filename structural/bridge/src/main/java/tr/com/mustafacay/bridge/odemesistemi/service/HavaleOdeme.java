package tr.com.mustafacay.bridge.odemesistemi.service;

// Refined Abstraction (Havale Ödemesi)
public class HavaleOdeme extends Odeme {
    public HavaleOdeme(Banka banka, double tutar) {
        super(banka, tutar);
    }

    @Override
    public void islemiGerceklestir() {
        System.out.println("Havale ile ödeme başlatıldı.");
        banka.odemeYap(tutar);
    }
}
