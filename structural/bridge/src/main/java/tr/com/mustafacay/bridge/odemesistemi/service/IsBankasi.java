package tr.com.mustafacay.bridge.odemesistemi.service;

// Concrete Implementor (İşBankası sınıfı)
public class IsBankasi extends Banka {
    public IsBankasi() {
        super("İş Bankası", "IBK123");
    }

    @Override
    public void odemeYap(double tutar) {
        System.out.println(bankaAdi + " üzerinden " + tutar + " TL ödeme yapıldı.");
    }
}
