package tr.com.mustafacay.strategy.service;

// Uygulama sınıfı, farklı rota bulma stratejilerini kullanarak rotaları bulur.
public class NavigasyonUygulamasi {
    private RotaBulucu rotaBulucu;

    public void setRotaBulucu(RotaBulucu rotaBulucu) {
        this.rotaBulucu = rotaBulucu;
    }

    public void rotaBul(String baslangic, String varis) {
        rotaBulucu.rotaBul(baslangic, varis);
    }
}
