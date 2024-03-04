package tr.com.mustafacay.observer.service;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject: Stok durumunu izleyen mağaza sınıfı
public class Store implements Subject {
    private String productName;
    private int stockCount;
    private List<Observer> observers;

    public Store(String productName, int initialStock) {
        this.productName = productName;
        this.stockCount = initialStock;
        this.observers = new ArrayList<>();
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
        notifyObservers(); // Stok güncellendiğinde gözlemcilere bildirim gönder
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(productName, stockCount);
        }
    }
}
