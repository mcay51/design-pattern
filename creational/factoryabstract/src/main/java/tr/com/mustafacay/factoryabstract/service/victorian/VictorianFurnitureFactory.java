package tr.com.mustafacay.factoryabstract.service.victorian;

import tr.com.mustafacay.factoryabstract.service.Furniture;
import tr.com.mustafacay.factoryabstract.service.FurnitureFactory;
//Klasik Mobilya üreten fabrika
public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new VictorianFurniture();
    }
}
