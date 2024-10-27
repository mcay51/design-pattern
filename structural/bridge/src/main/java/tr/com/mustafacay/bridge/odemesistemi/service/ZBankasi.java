package tr.com.mustafacay.bridge.odemesistemi.service;

// Concrete Implementor (ZiraatBankası sınıfı)
public class ZBankasi extends Banka {
    public ZBankasi() {
        super("Ziraat Bankası", "ZRT456");
    }

    @Override
    public void odemeYap(double tutar) {
        System.out.println(bankaAdi + " üzerinden " + tutar + " TL ödeme yapıldı.");
    }
}