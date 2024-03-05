package tr.com.mustafacay.visitor.service;

/**
 *  Ziyaretçi arabirimi
 */
public interface Visitor {
    public void visit(City city);
    public void visit(Industry industry);
    public void visit(TouristSpot touristSpot);
}
