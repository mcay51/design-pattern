package tr.com.mustafacay.strategy.service;

// RotaBulucu arayüzü, farklı rota bulma stratejilerini temsil eder.
public interface RotaBulucu {
    void rotaBul(String baslangic, String varis);
}
