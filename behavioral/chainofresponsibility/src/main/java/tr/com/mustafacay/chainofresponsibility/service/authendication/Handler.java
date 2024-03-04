package tr.com.mustafacay.chainofresponsibility.service.authendication;

/**
 * İşleyici arayüzü
  */
public interface Handler {
    void handleRequest(Request request);
}

