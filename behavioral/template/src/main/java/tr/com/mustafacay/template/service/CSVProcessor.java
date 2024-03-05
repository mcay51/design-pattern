package tr.com.mustafacay.template.service;

/**
 * CSV dosyalarını işlemek için şablon yöntemini uygulayan somut alt sınıf
  */
public class CSVProcessor extends DocumentProcessor {

    @Override
    void openDocument() {
        System.out.println("CSV belgesi açılıyor...");
    }

    @Override
    void extractData() {
        System.out.println("CSV belgesinden veri çıkartılıyor...");
    }

    @Override
    void generateReport() {
        System.out.println("CSV belgesi için rapor oluşturuluyor...");
    }

    @Override
    void closeDocument() {
        System.out.println("CSV belgesi kapatılıyor...");
    }
}
