package tr.com.mustafacay.chainofresponsibility;

import tr.com.mustafacay.chainofresponsibility.service.authendication.AuthenticationHandler;
import tr.com.mustafacay.chainofresponsibility.service.authendication.CachingHandler;
import tr.com.mustafacay.chainofresponsibility.service.authendication.DataCleaningHandler;
import tr.com.mustafacay.chainofresponsibility.service.authendication.Handler;
import tr.com.mustafacay.chainofresponsibility.service.authendication.Request;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Chain of Responsibilty Design Pattern");

        // İşleyicileri oluştur
        Handler cachingHandler = new CachingHandler(null); // Son işlem olduğu için bir sonraki işleyici null
        Handler dataCleaningHandler = new DataCleaningHandler(cachingHandler);
        Handler authenticationHandler = new AuthenticationHandler(dataCleaningHandler);

        // İstek oluştur
        Request request = new Request("username:password;order_data");

        // İstek işleniyor
        authenticationHandler.handleRequest(request);
    }
}