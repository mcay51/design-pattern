package tr.com.mustafacay.state.service;
/**
 * ConcreteState sınıfları, belirli durumlar için davranışları uygular.
 * State -> Moderasyon
 */
public class ModerationState implements State {
    @Override
    public void publish(Document document) {
        if (document.getUser().isAdmin()) {
            System.out.println("Belge moderasyon aşamasında, ancak yayımlanabilir.");
            document.setState(new PublishedState()); // Yayımlanmış duruma geçiş yapılır
        } else {
            System.out.println("Belge moderasyon aşamasında ve yayımlanamaz.");
        }
    }
}
