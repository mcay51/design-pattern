package tr.com.mustafacay.chainofresponsibility.service.authendication;


/**
 * Giriş doğrulama işleyicisi
  */
public class AuthenticationHandler implements Handler {
    private Handler nextHandler;

    public AuthenticationHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (authenticate(request)) {
            System.out.println("Authentication successful.");
            // Bir sonraki işleyiciyi çağır
            System.out.println("Sonraki İşleyici çağırılıyor");
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Authentication failed. Request halted.");
        }
    }

    private boolean authenticate(Request request) {
        // Gerçek kimlik doğrulama işlemi burada gerçekleştirilir
        // Örnek olarak, sadece bir ifade döndürüyoruz
        System.out.println("Kimlik doğrulama işlemi gerçekleştiriliyor.");
        return request.getData().contains("username:password");
    }
}