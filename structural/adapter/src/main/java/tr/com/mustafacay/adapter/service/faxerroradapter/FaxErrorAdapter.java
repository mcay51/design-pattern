package tr.com.mustafacay.adapter.service.faxerroradapter;

/**
 * Error arabirimine dayalı olarak oluşturulmuş FaxErrorAdapter sınıfı,
 * fax hatalarını temsil etmek için bir adaptördür
 */
public class FaxErrorAdapter implements Error {
    private FaxError faxError;

    // Constructor, fax hata nesnesini alır
    public FaxErrorAdapter(FaxError faxError) {
        this.faxError = faxError;
    }

    // Hata numarasını döndürür (fax hatalarında özel bir hata numarası olmadığı varsayılarak genel bir numara döndürülüyor)
    @Override
    public int errorNumber() {
        return -1; // Genel bir hata numarası
    }

    // Hata açıklamasını döndürür
    @Override
    public String description() {
        return faxError.getFaxErrorCode() + ": " + faxError.getFaxErrorMessage();
    }

    // Hata bildirimini e-posta ile gönderir
    @Override
    public void sendMail() {
        // Fax hatası e-posta olarak gönderilecek şekilde burada işlenebilir
        String faxMessage = "Fax Hatası: " + faxError.getFaxErrorCode() + " - " + faxError.getFaxErrorMessage();
        System.out.println("E-posta ile hata bildirimi gönderildi: " + faxMessage);
    }
}
