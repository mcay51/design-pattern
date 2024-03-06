package tr.com.mustafacay.adapter.service.xmltojson;

/**
 * XML formatındaki veriyi JSON formatına dönüştüren adaptör sınıfı
  */
public class XmlToJsonAdapter implements Analytics {
    private JsonAnalytics jsonAnalytics;

    // Constructor ile JSON formatında analiz yapacak sınıfın örneği alınır
    public XmlToJsonAdapter(JsonAnalytics jsonAnalytics) {
        this.jsonAnalytics = jsonAnalytics;
    }

    // XML verisini JSON formatına dönüştürerek analiz yapacak metot
    @Override
    public void analyzeData(String data) {
        // XML verisini JSON formatına dönüştür
        String jsonData = convertXmlToJson(data);
        // Dönüştürülen JSON verisini JSON analiz sınıfına aktar
        jsonAnalytics.performAnalysis(jsonData);
    }

    // XML verisini JSON formatına dönüştüren metod
    private String convertXmlToJson(String xmlData) {
        // XML verisi JSON formatına dönüştürülür (örnek olarak varsayalım)
        String jsonData = xmlData + " converted to JSON"; // Gerçek dönüştürme işlemi burada yapılmalı
        System.out.println("Dönüştürme işlemi yapıldı xmlData: "+xmlData+"\n"+" Json: "+jsonData);

        return jsonData;
    }
}
