package tr.com.mustafacay.factoryabstract.service.modern;

import tr.com.mustafacay.factoryabstract.service.Furniture;
//Modern Tarzda Mobilya
public class ModernFurniture implements Furniture {
    @Override
    public void assemble() {
        System.out.println("Modern Tarzda Mobilya Üretildi....");

    }
}
