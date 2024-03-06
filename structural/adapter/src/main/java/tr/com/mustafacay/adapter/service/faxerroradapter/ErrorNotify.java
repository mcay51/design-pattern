package tr.com.mustafacay.adapter.service.faxerroradapter;

public class ErrorNotify {
    // Hata işleme ve bildirimi metodu
    public static void handleAndNotifyError(Error error) {
        // Hata işleme işlemleri burada gerçekleştirilir (örneğin, loglama)
        System.out.println("Hata işlendi: " + error.description());

        // Hata bildirimi yapılır
        error.sendMail();
    }
}
