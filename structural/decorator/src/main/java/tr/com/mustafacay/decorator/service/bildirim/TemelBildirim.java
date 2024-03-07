package tr.com.mustafacay.decorator.service.bildirim;

/**
 * Temel bildirim sınıfı temel e-posta bildirim işlevselliğini sağlar.
  */
public class TemelBildirim implements Bildirim {
    @Override
    public void gonder(String mesaj) {
        System.out.println("E-posta gönderiliyor: " + mesaj);
    }
}
