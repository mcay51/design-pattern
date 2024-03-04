package tr.com.mustafacay.chainofresponsibility.service.authendication;
/**
 * Önbelleğe alma işleyicisi
  */
public class CachingHandler implements Handler {
    private Handler nextHandler;

    public CachingHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("Checking cache...");
        // Önbelleğe alma işlemi gerçekleştirilir
        // (Burada sadece bir çıktı basılır)
        // Son işlem olduğu için bir sonraki işleyiciyi çağırmıyoruz
        System.out.println("Son işlem");
    }
}
