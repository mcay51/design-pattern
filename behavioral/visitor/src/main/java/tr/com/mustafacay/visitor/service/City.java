package tr.com.mustafacay.visitor.service;
/**
 * Şehir düğümü
  */
public class City implements GeographicElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void explore() {
        System.out.println("Exploring the city...");
    }
}
