package tr.com.mustafacay.factoryabstract.service.victorian;

import tr.com.mustafacay.factoryabstract.service.Furniture;

//Klasik tarzda mobilya
public class VictorianFurniture implements Furniture {
    @Override
    public void assemble() {
        System.out.println("Klasik Tarzda Mobilya Üretildi...");
    }
}
