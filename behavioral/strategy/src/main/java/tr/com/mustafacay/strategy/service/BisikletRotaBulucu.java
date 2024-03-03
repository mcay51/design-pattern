package tr.com.mustafacay.strategy.service;


// BisikletRotaBulucu, bisikletle seyahat edenler için rota bulma stratejisini uygular.
public class BisikletRotaBulucu implements RotaBulucu {
    @Override
    public void rotaBul(String baslangic, String varis) {
        System.out.println("Bisikletle rota bulunuyor: " + baslangic + " -> " + varis+ "\n");
        // Bisiklet rotası hesaplama işlemleri burada gerçekleştirilir
    }
}