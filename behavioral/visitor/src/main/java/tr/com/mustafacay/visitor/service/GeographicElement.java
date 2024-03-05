package tr.com.mustafacay.visitor.service;

/**
 * Coğrafi bilgi düğümünü temsil eden arabirim
  */
public interface GeographicElement {
    void accept(Visitor visitor);
}
