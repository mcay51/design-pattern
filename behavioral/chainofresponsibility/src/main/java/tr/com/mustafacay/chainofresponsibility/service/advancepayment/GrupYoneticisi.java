package tr.com.mustafacay.chainofresponsibility.service.advancepayment;

/**
 * Grup yöneticisi sınıfı, 5000 TL'ye kadar olan talepleri işler
  */
public class GrupYoneticisi extends Calisan {
    @Override
    public void processRequest(double amount) {
        if (amount <= 5000) {
            System.out.println("Grup Yöneticisi onayladı: " + amount + " TL");
        } else if (nextApprover != null) {
            System.out.println("Grup Yöneticisi: İstenen tutar onay için üst onaycıya gönderildi.");
            nextApprover.processRequest(amount);
        }
    }
}