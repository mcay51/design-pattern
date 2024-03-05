package tr.com.mustafacay.chainofresponsibility.service.advancepayment;

/**
 * Abstract sınıfımız Calisan, tüm çalışanları temsil eder
  */
public abstract class Calisan {
    protected Calisan nextApprover; // Kendinden sonraki onaycıyı tutar

    // Kendinden sonraki onaycıyı ayarlamak için setter metodu
    public void setNextApprover(Calisan nextApprover) {
        this.nextApprover = nextApprover;
    }

    // Talebi işleme metodu, abstract olarak tanımlanmıştır ve alt sınıflarda uygulanacaktır
    public abstract void processRequest(double amount);
}
