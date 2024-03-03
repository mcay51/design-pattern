package tr.com.mustafacay.strategy;

import tr.com.mustafacay.strategy.service.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Strategy Design Pattern");

        NavigasyonUygulamasi uygulama = new NavigasyonUygulamasi();

        // Araba ile rota bulma stratejisi kullanılıyor
        System.out.println("Araba ile rota bulma stratejisi kullanılıyor");
        uygulama.setRotaBulucu(new ArabaRotaBulucu());
        uygulama.rotaBul("Ev", "İş");

        // Yürüyerek rota bulma stratejisi kullanılıyor
        System.out.println("Yürüyerek rota bulma stratejisi kullanılıyor");
        uygulama.setRotaBulucu(new YurumeRotaBulucu());
        uygulama.rotaBul("Ev", "Market");

        // Bisiklet ile rota bulma stratejisi kullanılıyor
        System.out.println("Bisiklet ile rota bulma stratejisi kullanılıyor");
        uygulama.setRotaBulucu(new BisikletRotaBulucu());
        uygulama.rotaBul("Ev", "Park");

        // Toplu taşıma ile rota bulma stratejisi kullanılıyor
        System.out.println("Toplu taşıma ile rota bulma stratejisi kullanılıyor");
        uygulama.setRotaBulucu(new TopluTasimaRotaBulucu());
        uygulama.rotaBul("Ev", "Hastane");
    }
}