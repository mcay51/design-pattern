package tr.com.mustafacay.strategy.service;

// TopluTasimaRotaBulucu, toplu taşıma ile seyahat edenler için rota bulma stratejisini uygular.
public class TopluTasimaRotaBulucu implements RotaBulucu {
    @Override
    public void rotaBul(String baslangic, String varis) {
        System.out.println("Toplu taşıma ile rota bulunuyor: " + baslangic + " -> " + varis+ "\n");
        // Toplu taşıma rotası hesaplama işlemleri burada gerçekleştirilir
    }
}