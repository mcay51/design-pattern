package tr.com.mustafacay.template.service;

/**
 * Şablon yöntemini tanımlayan soyut sınıf
  */
public abstract class DocumentProcessor {

    // Belge işleme adımlarını içeren şablon yöntemi
    public void processDocument() {
        openDocument(); // Belgeyi açma işlemi
        extractData(); // Veri çıkarma işlemi
        generateReport(); // Rapor oluşturma işlemi
        closeDocument(); // Belgeyi kapatma işlemi
    }

    // Alt sınıflar tarafından uygulanacak soyut yöntemler
    abstract void openDocument(); // Belgeyi açma işlemi
    abstract void extractData(); // Veri çıkarma işlemi
    abstract void generateReport(); // Rapor oluşturma işlemi
    abstract void closeDocument(); // Belgeyi kapatma işlemi
}