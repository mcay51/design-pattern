package tr.com.mustafacay.flyweight.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Factory sınıfı: Flyweight nesnelerini yönetir ve oluşturur
  */
public class OyunNesnesiFabrikasi {
    private Map<AskerTipi, OyunNesnesi> nesneHavuzu = new HashMap<>();

    public OyunNesnesi nesneAl(AskerTipi tip) {
        if (!nesneHavuzu.containsKey(tip.toString())) {
            nesneHavuzu.put(tip, new Asker(tip)); // Yeni bir asker oluştur
        }
        return nesneHavuzu.get(tip);
    }
}
