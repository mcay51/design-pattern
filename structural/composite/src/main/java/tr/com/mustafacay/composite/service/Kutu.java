package tr.com.mustafacay.composite.service;
import java.util.List;
import java.util.ArrayList;
/**
 * Composite Class: Kutuları temsil eder.
  */
public class Kutu implements Fiyatlanabilir {
    private String ad;
    private List<Fiyatlanabilir> icerikler = new ArrayList<>();

    public Kutu(String ad) {
        this.ad = ad;
    }

    public void icerikEkle(Fiyatlanabilir icerik) {
        icerikler.add(icerik);
    }

    @Override
    public double fiyatHesapla() {
        double toplamFiyat = 0;
        for (Fiyatlanabilir icerik : icerikler) {
            toplamFiyat += icerik.fiyatHesapla();
        }
        return toplamFiyat;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ad).append(":\n");
        for (Fiyatlanabilir icerik : icerikler) {
            sb.append("- ").append(icerik).append("\n");
        }
        return sb.toString();
    }
}