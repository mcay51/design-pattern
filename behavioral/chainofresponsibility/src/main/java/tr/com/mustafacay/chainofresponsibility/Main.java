package tr.com.mustafacay.chainofresponsibility;

import tr.com.mustafacay.chainofresponsibility.service.advancepayment.Direktor;
import tr.com.mustafacay.chainofresponsibility.service.advancepayment.GrupYoneticisi;
import tr.com.mustafacay.chainofresponsibility.service.advancepayment.Yonetici;
import tr.com.mustafacay.chainofresponsibility.service.authendication.AuthenticationHandler;
import tr.com.mustafacay.chainofresponsibility.service.authendication.CachingHandler;
import tr.com.mustafacay.chainofresponsibility.service.authendication.DataCleaningHandler;
import tr.com.mustafacay.chainofresponsibility.service.authendication.Handler;
import tr.com.mustafacay.chainofresponsibility.service.authendication.Request;

import tr.com.mustafacay.chainofresponsibility.service.advancepayment.Calisan;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Chain of Responsibilty Design Pattern");
        System.out.println("Örnek 1 Authendication");
        authendicationOrnek();
        System.out.println("------------------------------\n");

        System.out.println("Örnek 2 Advance Payment (Avans Verme)");
        advancePaymentOrnek();
        System.out.println("------------------------------\n");


    }

    public static void authendicationOrnek(){
        // İşleyicileri oluştur
        Handler cachingHandler = new CachingHandler(null); // Son işlem olduğu için bir sonraki işleyici null
        Handler dataCleaningHandler = new DataCleaningHandler(cachingHandler);
        Handler authenticationHandler = new AuthenticationHandler(dataCleaningHandler);

        // İstek oluştur
        Request request = new Request("username:password;order_data");

        // İstek işleniyor
        authenticationHandler.handleRequest(request);
    }
    public static void  advancePaymentOrnek(){
        // Çalışanlar oluşturuluyor
        Calisan yonetici = new Yonetici();
        Calisan grupYoneticisi = new GrupYoneticisi();
        Calisan direktor = new Direktor();

        // Onaycı zinciri oluşturuluyor
        System.out.println("Onay Zinciri : Yönetici-> Grup Yöneticisi -> Director");
        yonetici.setNextApprover(grupYoneticisi);
        grupYoneticisi.setNextApprover(direktor);

        // Talep işleniyor
        double talepMiktari = 10000;
        yonetici.processRequest(talepMiktari);
    }
}