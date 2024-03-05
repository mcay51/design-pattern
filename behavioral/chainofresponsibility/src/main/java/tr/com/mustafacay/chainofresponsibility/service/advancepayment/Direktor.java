package tr.com.mustafacay.chainofresponsibility.service.advancepayment;
/**
 * Direktör sınıfı, herhangi bir tutar talebini işler
  */
public class Direktor extends Calisan {
    @Override
    public void processRequest(double amount) {
        System.out.println("Direktör onayladı: " + amount + " TL");
    }
}
