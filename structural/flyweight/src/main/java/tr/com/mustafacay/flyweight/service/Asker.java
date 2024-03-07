package tr.com.mustafacay.flyweight.service;

/**
 * ConcreteFlyweight sınıfı: Ortak özellikleri tutar
  */
public class Asker implements OyunNesnesi {
    private AskerTipi tip; // İçsel durum (intrinsic state)

    public Asker(AskerTipi tip) {
        this.tip = tip;
    }

    @Override
    public void ekranaCiz(int x, int y) {
        // Mermiyi ekrana çizme işlemleri
        System.out.println(tip + " Asker, x: " + x + ", y: " + y + " konumuna çizildi.");
    }
}
