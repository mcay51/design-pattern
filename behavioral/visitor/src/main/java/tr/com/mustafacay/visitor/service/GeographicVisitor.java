package tr.com.mustafacay.visitor.service;

/**
 * Coğrafi bilgi düğümlerini ziyaret eden ziyaretçi sınıfı
 */
public class GeographicVisitor implements Visitor {
    @Override
    public void visit(City city) {
        city.explore();
    }

    @Override
    public void visit(Industry industry) {
        industry.analyze();
    }

    @Override
    public void visit(TouristSpot touristSpot) {
        touristSpot.discover();
    }
}