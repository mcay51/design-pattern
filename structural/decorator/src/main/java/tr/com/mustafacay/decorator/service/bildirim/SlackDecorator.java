package tr.com.mustafacay.decorator.service.bildirim;
/**
 * Slack bildirimi decorator'u
  */
public class SlackDecorator implements BildirimDecorator {
    private final Bildirim temelBildirim;

    public SlackDecorator(Bildirim temelBildirim) {
        this.temelBildirim = temelBildirim;
    }

    @Override
    public void gonder(String mesaj) {
        temelBildirim.gonder(mesaj);
        System.out.println("Slack gönderiliyor: " + mesaj);
    }
}
