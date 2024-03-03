package tr.com.mustafacay.singleton;

import tr.com.mustafacay.singleton.service.Singleton;
import tr.com.mustafacay.singleton.service.SingletonImpl;

public class Main {
    public static void main(String[] args) {

        System.out.println("Singleton Hello world!");
        //getSingletonInstance metodu ile bir tane SingletonImpl sınıfı türetiyoruz.
        SingletonImpl singleton1 = SingletonImpl.getSingletonInstance();
        System.out.println("singleton1 uuId: "+singleton1.getUuId().toString());
        //Yukardaki yöntemin aynısı ile 2. bir SingletonImpl sınıfı türetiyoruz bu iki sınıfın
        //uuId değerleri aynıdır çünkü her iki instance birbirinin aynısıdır.
        SingletonImpl singleton2 = SingletonImpl.getSingletonInstance();
        System.out.println("singleton2 uuId: "+singleton2.getUuId().toString());
        //singleton2 yi klonlayarak singleton3 adında bir obje daha oluşturuyoruz.
        SingletonImpl singleton3=(SingletonImpl) singleton2.clone();
        System.out.println("singleton3 uuId: "+singleton3.getUuId().toString());
        //singleton4 ü de singleton1'in klonunu alarak oluşturuyoruz.
        SingletonImpl singleton4=(SingletonImpl) singleton1.clone();
        System.out.println("singleton4 uuId: "+singleton4.getUuId().toString());
        //singleton5'i singleton4 ün getSingletonInstance metodunu kullanarak türetiyoruz.
        SingletonImpl singleton5=(SingletonImpl) singleton4.getSingletonInstance();
        System.out.println("singleton5 uuId: "+singleton5.getUuId().toString());
        //singleton6'i singleton3 ün getSingletonInstance metodunu kullanarak türetiyoruz.
        SingletonImpl singleton6=(SingletonImpl) singleton3.getSingletonInstance();
        System.out.println("singleton6 uuId: "+singleton6.getUuId().toString());
        System.out.println("---------------------------------------------");
        System.out.println("singleton1 HashCode: "+singleton1.hashCode());
        System.out.println("singleton2 HashCode: "+singleton2.hashCode());
        System.out.println("singleton3 HashCode: "+singleton3.hashCode());
        System.out.println("singleton4 HashCode: "+singleton4.hashCode());
        System.out.println("singleton5 HashCode: "+singleton5.hashCode());
        System.out.println("singleton6 HashCode: "+singleton6.hashCode());
        //Sonuç olarak singleton3 ve singleton4 klon Objeler ve hashCode oları farklı olsalar
        // dahi sonuç olarak
        //tüm instance'lar statik bir alana kaydededilmiş olan ve ön
        //bellekteki aynı nesnedir.













    }
}