package tr.com.mustafacay.facade.service;

/**
 * Facade sınıfı
  */
public class KrediFirsati {
    private Banka banka;
    private Kredi kredi;
    private MerkezBanka merkezBanka;

    public KrediFirsati() {
        this.banka = new Banka();
        this.kredi = new Kredi();
        this.merkezBanka = new MerkezBanka();
    }

    public void krediKullan(Musteri musteri, double miktar) {
        if (banka.krediKullanabilirMi(musteri, miktar) && merkezBanka.krediKullanabilirMi(musteri,miktar)) {
            kredi.krediKullan(musteri, miktar);
        } else {
            System.out.println("Kredi kullanımı reddedildi.");
        }
    }
}
