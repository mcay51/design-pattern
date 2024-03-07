package tr.com.mustafacay.decorator.service.bildirim;

/**
 * Temel bildirim arayüzü bildirim gönderme işlevselliğini tanımlar.
  */
public interface Bildirim {
    void gonder(String mesaj);
}
