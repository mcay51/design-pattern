package tr.com.mustafacay.observer.service;

// Observer interface'i, haber almak isteyen tüm sınıflar için bir arayüz sağlar
public interface Observer {
    void update(String productName, int stockCount);
}
