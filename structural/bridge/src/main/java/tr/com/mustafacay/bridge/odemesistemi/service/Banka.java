package tr.com.mustafacay.bridge.odemesistemi.service;

// Implementor (Banka arayüzü)
public abstract class Banka {
    protected String bankaAdi;
    protected String bankaKodu;

    public Banka(String bankaAdi, String bankaKodu) {
        this.bankaAdi = bankaAdi;
        this.bankaKodu = bankaKodu;
    }

    public abstract void odemeYap(double tutar);
}
