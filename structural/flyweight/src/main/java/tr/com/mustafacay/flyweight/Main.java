package tr.com.mustafacay.flyweight;

import tr.com.mustafacay.flyweight.service.AskerTipi;
import tr.com.mustafacay.flyweight.service.OyunNesnesi;
import tr.com.mustafacay.flyweight.service.OyunNesnesiFabrikasi;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Flyweight Design Pattern");

        OyunNesnesiFabrikasi fabrika = new OyunNesnesiFabrikasi();

        // Askerleri oluştur
        OyunNesnesi asker1 = fabrika.nesneAl(AskerTipi.PIYADE);
        OyunNesnesi asker2 = fabrika.nesneAl(AskerTipi.PIYADE);
        OyunNesnesi asker3 = fabrika.nesneAl(AskerTipi.TOPCU);
        OyunNesnesi asker4 = fabrika.nesneAl(AskerTipi.HAVACI);
        OyunNesnesi asker5 = fabrika.nesneAl(AskerTipi.DENIZCI);

        // Askerleri ekrana çiz
        asker1.ekranaCiz(100, 50);
        asker2.ekranaCiz(120, 60);
        asker3.ekranaCiz(150, 70);
        asker4.ekranaCiz(170, 80);
        asker5.ekranaCiz(180, 90);


    }
}