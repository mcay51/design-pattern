package tr.com.mustafacay.adapter.service.faxerroradapter;

/**
 * Error Arayüzü
 */
public interface Error {
    public int errorNumber();

    public String description();

    public void sendMail();
}
