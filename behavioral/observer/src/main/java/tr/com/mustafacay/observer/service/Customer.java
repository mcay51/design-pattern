package tr.com.mustafacay.observer.service;

// Concrete Observer: Haber almak isteyen müşteri sınıfı
public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName, int stockCount) {
        System.out.println(name + ": " + productName + " ürününün stok durumu güncellendi. Yeni stok: " + stockCount);
    }
}

