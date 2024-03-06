package tr.com.mustafacay.facade;

import tr.com.mustafacay.facade.service.Musteri;
import tr.com.mustafacay.facade.service.KrediFirsati;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Facade Design Pattern");

        KrediFirsati krediFirsati = new KrediFirsati();
        Musteri musteri = new Musteri("Ahmet");

        // Facade aracılığıyla kredi kullanımı
        krediFirsati.krediKullan(musteri, 10000);
    }
}