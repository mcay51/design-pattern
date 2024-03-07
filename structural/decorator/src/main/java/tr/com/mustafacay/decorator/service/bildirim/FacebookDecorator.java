package tr.com.mustafacay.decorator.service.bildirim;

/**
 * Facebook bildirimi decorator'u
  */
public class FacebookDecorator implements BildirimDecorator {
    private final Bildirim temelBildirim;

    public FacebookDecorator(Bildirim temelBildirim) {
        this.temelBildirim = temelBildirim;
    }

    @Override
    public void gonder(String mesaj) {
        temelBildirim.gonder(mesaj);
        System.out.println("Facebook gönderiliyor: " + mesaj);
    }
}

