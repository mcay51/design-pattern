package tr.com.mustafacay.observer.service;

// Subject interface'i, gözlemcileri eklemek, kaldırmak ve güncellemek için bir arayüz sağlar
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
