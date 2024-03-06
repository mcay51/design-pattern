package tr.com.mustafacay.proxy.service;
import lombok.Getter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * GerçekDosyaOkuma sınıfı
 */
public class GercekDosyaOkuma implements DosyaOkuma {
    @Getter
    private final String dosyaAdi;

    public GercekDosyaOkuma(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }

    @Override
    public void dosyaOku() {
        try {
            File dosya = new File(dosyaAdi);
            Scanner scanner = new Scanner(dosya);
            while (scanner.hasNextLine()) {
                String satir = scanner.nextLine();
                System.out.println(satir);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: " + dosyaAdi);
        }
    }
}
