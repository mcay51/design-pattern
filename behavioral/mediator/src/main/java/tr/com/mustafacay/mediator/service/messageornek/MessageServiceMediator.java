package tr.com.mustafacay.mediator.service.messageornek;
/**
 * Mediator Arayüzü
 */
public interface MessageServiceMediator {
    void register(Member member);
    void sendMessage(String messageFrom,String messageTo,String message);
}
