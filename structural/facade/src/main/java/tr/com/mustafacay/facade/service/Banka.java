package tr.com.mustafacay.facade.service;

/**
 * Alt sistem sınıfları
  */
public class Banka implements KrediKullandir{
    @Override
    public boolean krediKullanabilirMi(Musteri musteri, double miktar) {
        // Banka tarafından müşterinin kredi kullanıp kullanamayacağına dair kontrol yapılır
        return true; // Örnek bir kontrol sonucu
    }
}
