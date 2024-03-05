package tr.com.mustafacay.visitor.service;

/**
 * Sanayi düğümü
  */
public class Industry implements GeographicElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void analyze() {
        System.out.println("Analyzing the industry...");
    }
}
