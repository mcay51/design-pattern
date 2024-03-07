package tr.com.mustafacay.decorator.service.bildirim;


/**
 * SMS bildirimi decorator'u
 */
public class SmsDecorator implements BildirimDecorator {
    private final Bildirim temelBildirim;

    public SmsDecorator(Bildirim temelBildirim) {
        this.temelBildirim = temelBildirim;
    }

    @Override
    public void gonder(String mesaj) {
        temelBildirim.gonder(mesaj);
        System.out.println("SMS gönderiliyor: " + mesaj);
    }
}
