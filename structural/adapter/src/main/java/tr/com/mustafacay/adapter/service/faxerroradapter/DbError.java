package tr.com.mustafacay.adapter.service.faxerroradapter;

/**
 * IError arabirimine dayalı olarak oluşturulmuş DbError sınıfı, veritabanı hatalarını temsil eder
  */
public class DbError implements Error {
    private int errorNumber;
    private String description;

    // Constructor, hata numarası ve açıklamasını alır
    public DbError(int errorNumber, String description) {
        this.errorNumber = errorNumber;
        this.description = description;
    }

    // Hata numarasını döndürür
    @Override
    public int errorNumber() {
        return errorNumber;
    }

    // Hata açıklamasını döndürür
    @Override
    public String description() {
        return description;
    }

    // Hata bildirimini e-posta ile gönderir
    @Override
    public void sendMail() {
        // E-posta gönderme işlemi burada gerçekleştirilmelidir
        System.out.println("E-posta ile hata bildirimi gönderildi: " + toString());
    }
}
