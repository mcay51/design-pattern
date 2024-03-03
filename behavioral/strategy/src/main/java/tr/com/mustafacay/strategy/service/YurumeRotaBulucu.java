package tr.com.mustafacay.strategy.service;

// YurumeRotaBulucu, yürüyerek seyahat edenler için rota bulma stratejisini uygular.
public class YurumeRotaBulucu implements RotaBulucu {
    @Override
    public void rotaBul(String baslangic, String varis) {
        System.out.println("Yürüyerek rota bulunuyor: " + baslangic + " -> " + varis+ "\n");
        // Yürüme rotası hesaplama işlemleri burada gerçekleştirilir
    }
}

