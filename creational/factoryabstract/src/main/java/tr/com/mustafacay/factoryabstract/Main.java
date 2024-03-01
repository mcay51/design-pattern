package tr.com.mustafacay.factoryabstract;

import tr.com.mustafacay.factoryabstract.service.Furniture;
import tr.com.mustafacay.factoryabstract.service.FurnitureFactory;
import tr.com.mustafacay.factoryabstract.service.modern.ModernFurnitureFactory;
import tr.com.mustafacay.factoryabstract.service.victorian.VictorianFurnitureFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Abstract Factory");
        // Modern mobilya fabrikası ile modern tarzda koltuk oluşturuluyor
        FurnitureFactory factory=new ModernFurnitureFactory();
        Furniture furniture=factory.createFurniture();
        furniture.assemble();

        // Viktoryen mobilya fabrikası ile Viktoryen tarzda koltuk oluşturuluyor
        factory=new VictorianFurnitureFactory();
        furniture=factory.createFurniture();
        furniture.assemble();
    }
}