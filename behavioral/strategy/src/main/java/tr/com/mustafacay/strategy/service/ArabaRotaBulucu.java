package tr.com.mustafacay.strategy.service;

// ArabaRotaBulucu, arabayla seyahat edenler için rota bulma stratejisini uygular.
public class ArabaRotaBulucu implements RotaBulucu {
    @Override
    public void rotaBul(String baslangic, String varis) {
        System.out.println("Arabayla rota bulunuyor: " + baslangic + " -> " + varis+ "\n");
        // Araba rotası hesaplama işlemleri burada gerçekleştirilir
    }
}
