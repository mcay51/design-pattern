package tr.com.mustafacay.interpreter.service.romannumeral;

import java.util.HashMap;
import java.util.Map;

/**
 * Context sınıfı, yorumlanacak ifadelerin değerlerini ve işlemlerini içerir.
  */
public class Context {
    // Roma rakamlarının sayısal değerlerini tutacak harita
    private Map<Character, Integer> romanNumerals = new HashMap<>();

    // Bağlam oluşturulduğunda Roma rakamlarını haritaya ekler
    public Context() {
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
    }

    // Verilen Roma rakamı sembolünün sayısal değerini döndürür
    public int getValue(char romanNumeral) {
        return romanNumerals.get(romanNumeral);
    }
}
