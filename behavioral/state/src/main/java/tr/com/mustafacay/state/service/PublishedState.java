package tr.com.mustafacay.state.service;
/**
 * ConcreteState sınıfları, belirli durumlar için davranışları uygular.
 * State -> Yayımlanmış
 */
public class PublishedState implements State {
    @Override
    public void publish(Document document) {
        System.out.println("Belge zaten yayımlanmış durumda.");
    }
}
