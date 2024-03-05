package tr.com.mustafacay.template.service;

/**
 * DOC dosyalarını işlemek için şablon yöntemini uygulayan somut alt sınıf
 */
public class DOCProcessor extends DocumentProcessor {

    @Override
    void openDocument() {
        System.out.println("DOC belgesi açılıyor...");
    }

    @Override
    void extractData() {
        System.out.println("DOC belgesinden veri çıkartılıyor...");
    }

    @Override
    void generateReport() {
        System.out.println("DOC belgesi için rapor oluşturuluyor...");
    }

    @Override
    void closeDocument() {
        System.out.println("DOC belgesi kapatılıyor...");
    }
}

