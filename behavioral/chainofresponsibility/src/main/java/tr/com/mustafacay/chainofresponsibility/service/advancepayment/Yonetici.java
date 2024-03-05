package tr.com.mustafacay.chainofresponsibility.service.advancepayment;

/**
 * Yönetici sınıfı, 2000 TL'ye kadar olan talepleri işler
  */
public class Yonetici extends Calisan {
    @Override
    public void processRequest(double amount) {
        if (amount <= 2000) {
            System.out.println("Yönetici onayladı: " + amount + " TL");
        } else if (nextApprover != null) {
            System.out.println("Yönetici : İstenen tutar onay için üst onaycıya gönderildi.");
            nextApprover.processRequest(amount);
        }
    }
}