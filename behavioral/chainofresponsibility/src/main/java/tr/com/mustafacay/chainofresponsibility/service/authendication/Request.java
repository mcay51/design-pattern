package tr.com.mustafacay.chainofresponsibility.service.authendication;

import lombok.Getter;

/**
 * İstek sınıfı
 */
@Getter
public class Request {
    private String data;

    public Request(String data) {
        this.data = data;
    }

}
