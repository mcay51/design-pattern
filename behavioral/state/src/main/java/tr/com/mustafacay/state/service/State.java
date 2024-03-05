package tr.com.mustafacay.state.service;

/**
 * State arayüzü, farklı durumlar için davranışları tanımlar.
  */
public interface State {
    void publish(Document document); // Belirli bir durum için yayımlama davranışını tanımlar
}
