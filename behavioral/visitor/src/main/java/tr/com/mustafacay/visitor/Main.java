package tr.com.mustafacay.visitor;

import tr.com.mustafacay.visitor.service.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Visitor Design Pattern");

        // Coğrafi bilgi düğümleri oluştur
        GeographicElement city = new City();
        GeographicElement industry = new Industry();
        GeographicElement touristSpot = new TouristSpot();

        // Ziyaretçi oluştur
        Visitor visitor = new GeographicVisitor();

        // Her düğümü ziyaretçiyle ziyaret et
        city.accept(visitor);
        industry.accept(visitor);
        touristSpot.accept(visitor);
    }
}