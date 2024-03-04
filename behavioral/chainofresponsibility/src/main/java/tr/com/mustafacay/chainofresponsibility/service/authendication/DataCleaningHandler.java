package tr.com.mustafacay.chainofresponsibility.service.authendication;

/**
 * Veri temizleme işleyicisi
  */
public class DataCleaningHandler implements Handler {
    private Handler nextHandler;

    public DataCleaningHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("Cleaning data...");
        // Veri temizleme işlemi gerçekleştirilir
        // (Burada sadece bir çıktı basılır)
        // Bir sonraki işleyiciyi
        System.out.println("Sonraki İşleyici Çağırılıyor");
        nextHandler.handleRequest(request);
    }
}

