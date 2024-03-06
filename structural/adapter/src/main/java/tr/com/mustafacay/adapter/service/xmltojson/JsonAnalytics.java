package tr.com.mustafacay.adapter.service.xmltojson;
/**
 * JSON formatındaki veriyi analiz eden sınıf
  */
public class JsonAnalytics implements Analytics {
    @Override
    public void analyzeData(String data) {
        // JSON formatındaki veriyi analiz et
        System.out.println("Analiz edilen JSON verisi: " + data);
        // Analiz sonuçlarını kullanıcıya sun
        System.out.println("Analiz sonuçları: ...");
    }

    public void performAnalysis(String jsonData) {
        System.out.println("Perform Analysis : "+jsonData);
    }

    // JSON verisini analiz eden diğer metodlar da burada olabilir
}

