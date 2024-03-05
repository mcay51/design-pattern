package tr.com.mustafacay.template.service;

/**
 * PDF dosyalarını işlemek için şablon yöntemini uygulayan somut alt sınıf
  */
public class PDFProcessor extends DocumentProcessor {

    @Override
    void openDocument() {
        System.out.println("PDF belgesi açılıyor...");
    }

    @Override
    void extractData() {
        System.out.println("PDF belgesinden veri çıkartılıyor...");
    }

    @Override
    void generateReport() {
        System.out.println("PDF belgesi için rapor oluşturuluyor...");
    }

    @Override
    void closeDocument() {
        System.out.println("PDF belgesi kapatılıyor...");
    }
}
