package tr.com.mustafacay.adapter;

import tr.com.mustafacay.adapter.service.faxerroradapter.DbError;
import tr.com.mustafacay.adapter.service.faxerroradapter.ErrorNotify;
import tr.com.mustafacay.adapter.service.faxerroradapter.FaxError;
import tr.com.mustafacay.adapter.service.faxerroradapter.FaxErrorAdapter;
import tr.com.mustafacay.adapter.service.xmltojson.JsonAnalytics;
import tr.com.mustafacay.adapter.service.xmltojson.XmlToJsonAdapter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Adapter Design Pattern\n");
        System.out.println("Örnek 1 Xml To Json");
        xmlToJsonOrnek();
        System.out.println("****************************************");
        System.out.println("Örnek 2 Fax Error Adapter");
        faxErrorAdapterOrnek();
    }
    public static void xmlToJsonOrnek(){
        // XML formatında gelen veriyi JSON formatında analiz eden sınıfın örneği
        JsonAnalytics jsonAnalytics = new JsonAnalytics();

        // XML verisini JSON formatına dönüştüren adaptör sınıfının örneği oluşturulur
        XmlToJsonAdapter adapter = new XmlToJsonAdapter(jsonAnalytics);

        // XML formatındaki veri (örnek olarak)
        String xmlData = "<data>...</data>";

        // Adaptör aracılığıyla XML verisi JSON formatına dönüştürülerek analiz edilir
        adapter.analyzeData(xmlData);
    }
    public static void faxErrorAdapterOrnek(){
        // Veritabanı hatası için DbError örneği oluşturulur
        DbError dbError = new DbError(101, "Veritabanı bağlantı hatası");

        // Fax hatası için FaxError örneği oluşturulur
        FaxError faxError = new FaxError(202, "Fax gönderim hatası");

        // FaxErrorAdapter ile FaxError'ü IError arabirimine uyumlu hale getirir
        FaxErrorAdapter faxErrorAdapter = new FaxErrorAdapter(faxError);

        // Veritabanı hatası için hata bildirimi yapılır
        System.out.println("Veritabanı Hatası:");
        ErrorNotify.handleAndNotifyError(dbError);

        // Fax hatası için hata bildirimi yapılır (FaxErrorAdapter kullanılarak)
        System.out.println("\nFax Hatası:");
        ErrorNotify.handleAndNotifyError(faxErrorAdapter);
    }
}