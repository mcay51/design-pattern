package tr.com.mustafacay.factoryabstract.service.modern;

import tr.com.mustafacay.factoryabstract.service.Furniture;
import tr.com.mustafacay.factoryabstract.service.FurnitureFactory;
//Modern Mobilya  üreten fabrika
public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new ModernFurniture();
    }
}
