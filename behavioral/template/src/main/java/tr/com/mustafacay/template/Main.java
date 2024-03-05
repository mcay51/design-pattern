package tr.com.mustafacay.template;
import tr.com.mustafacay.template.service.CSVProcessor;
import tr.com.mustafacay.template.service.DOCProcessor;
import tr.com.mustafacay.template.service.DocumentProcessor;
import tr.com.mustafacay.template.service.PDFProcessor;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Template Design Pattern");

        // DOC belgesi işleme
        System.out.println("DOC belgesi işleniyor:");
        DocumentProcessor docProcessor = new DOCProcessor();
        docProcessor.processDocument();

        // CSV belgesi işleme
        System.out.println("\nCSV belgesi işleniyor:");
        DocumentProcessor csvProcessor = new CSVProcessor();
        csvProcessor.processDocument();

        // PDF belgesi işleme
        System.out.println("\nPDF belgesi işleniyor:");
        DocumentProcessor pdfProcessor = new PDFProcessor();
        pdfProcessor.processDocument();
    }
}