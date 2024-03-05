package tr.com.mustafacay.state.service;

/**
 * ConcreteState sınıfları, belirli durumlar için davranışları uygular.
 * State -> Taslak
 */
class DraftState implements State {
    @Override
    public void publish(Document document) {
        System.out.println("Belge taslak durumunda olduğu için yayımlanamaz.");
    }
}
