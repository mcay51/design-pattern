package tr.com.mustafacay.visitor.service;
/**
 * Gezi alanı düğümü
  */
public class TouristSpot implements GeographicElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void discover() {
        System.out.println("Discovering the tourist spot...");
    }
}
