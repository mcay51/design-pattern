package tr.com.mustafacay.bridge.odemesistemi.service;

// Abstraction (Ödeme sınıfı)
public abstract class Odeme {
    protected Banka banka;
    protected double tutar;

    public Odeme(Banka banka, double tutar) {
        this.banka = banka;
        this.tutar = tutar;
    }

    public abstract void islemiGerceklestir();
}
