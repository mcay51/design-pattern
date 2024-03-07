package tr.com.mustafacay.decorator;

import tr.com.mustafacay.decorator.service.bildirim.*;
import tr.com.mustafacay.decorator.service.maas.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Decorator Design Pattern\n");

        System.out.println("Örnek 1 Bildirim Uygulaması");
      //  bildirimOrnek();
        System.out.println("********************************************\n");

        System.out.println("Örnek 2 Maaş Hesaplama");
        maasOrnek();


    }

    public static void bildirimOrnek(){
        // Temel bildirim nesnesi oluştur
        Bildirim temelBildirim = new TemelBildirim();

        // Temel bildirim nesnesini decorator'lerle sarmala
        BildirimDecorator smsDecorator = new SmsDecorator(temelBildirim);
        BildirimDecorator facebookDecorator = new FacebookDecorator(temelBildirim);
        BildirimDecorator slackDecorator = new SlackDecorator(temelBildirim);

        // Farklı bildirim yöntemlerini kullanarak mesaj gönder
        smsDecorator.gonder("Acil durum: Yangın var!");
        facebookDecorator.gonder("Yeni güncelleme: Proje tamamlandı.");
        slackDecorator.gonder("Toplantı hatırlatması: Yarın saat 10:00'da toplantı var.");

        System.out.println("____________________________________________\n");
        facebookDecorator = new FacebookDecorator(smsDecorator);
        slackDecorator = new SlackDecorator(facebookDecorator);
        smsDecorator = new SmsDecorator(slackDecorator);

        smsDecorator.gonder("Acil durum: Yangın var!");
        facebookDecorator.gonder("Yeni güncelleme: Proje tamamlandı.");
        slackDecorator.gonder("Toplantı hatırlatması: Yarın saat 10:00'da toplantı var.");
    }
    public static void maasOrnek(){
        double gelirVergisiOrani=0.15;
        double sskPrimOrani=0.14;
        // Temel maaş hesaplama işlevselliğini oluştur
        MaasHesaplama temelMaas = new TemelMaasHesaplama(5000);

        // Ekstra bonus ve ekstra primi ekleyerek maaşı hesapla
        //İşlem sırası :
        // 1 - ilk önce Ssk Primi Düşülür.
        // 2- ikinci olarak Maaşa Extra Prim Eklenir.
        // 3- üçüncü olarak Maaşa Mesai Eklenir.
        // 4- dördüncü olarak Gelir Vergisi Düşülür.
        // Yapı içi içe olduğu ve birbirini sarmaladığı için dipten yukarıya doğru işlemler gerçekleştirilir.
        MaasHesaplama maas =new GelirVergisiDecorator(
                new MesaiDecorator(
                        new PrimOdemesiDecorator(
                                new SSKPrimiDecorator(temelMaas,sskPrimOrani)
                                , 1000)
                        , 500)
                ,gelirVergisiOrani);

        // Toplam maaşı yazdır
        System.out.println("Toplam Maaş: " + maas.hesaplaMaas());
    }
}