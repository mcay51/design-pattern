package tr.com.mustafacay.observer;

import tr.com.mustafacay.observer.service.Customer;
import tr.com.mustafacay.observer.service.Store;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Observer Design Pattern");
        // Mağaza ve müşterileri oluştur
        Store store = new Store("Telefon", 10);
        Customer customer1 = new Customer("Mustafa");
        Customer customer2 = new Customer("Ahmet");
        Customer customer3 = new Customer("Ayşe");

        // Müşterileri mağazaya abone yap
        store.addObserver(customer1);
        store.addObserver(customer2);

        // Stok güncelleme ve gözlemcilerin haber alması
        store.setStockCount(8);
        store.setStockCount(5);

        // Müşteri 1'i abonelikten çıkart
        store.removeObserver(customer1);
        store.addObserver(customer3);

        // Stok güncelleme ve gözlemcilerin haber alması
        store.setStockCount(3);
    }
}