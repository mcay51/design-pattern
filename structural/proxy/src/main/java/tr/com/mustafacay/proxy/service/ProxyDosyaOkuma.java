package tr.com.mustafacay.proxy.service;

import java.io.File;

/**
 * ProxyDosyaOkuma sınıfı (Proxy)
  */
public class ProxyDosyaOkuma implements DosyaOkuma {
    private final GercekDosyaOkuma gercekDosyaOkuma;
    private final int maksimumBoyut;

    public ProxyDosyaOkuma(String dosyaAdi, int maksimumBoyut) {
        this.gercekDosyaOkuma = new GercekDosyaOkuma(dosyaAdi);
        this.maksimumBoyut = maksimumBoyut;
    }

    @Override
    public void dosyaOku() {
        File dosya = new File(gercekDosyaOkuma.getDosyaAdi());
        if (dosya.length() > maksimumBoyut) {
            System.out.println("Dosya çok büyük. Okunamadı.");
        } else {
            gercekDosyaOkuma.dosyaOku();
        }
    }
}
