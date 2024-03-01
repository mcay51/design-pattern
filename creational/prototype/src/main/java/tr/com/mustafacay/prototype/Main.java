package tr.com.mustafacay.prototype;

import tr.com.mustafacay.prototype.service.Color;
import tr.com.mustafacay.prototype.service.ProductImpl;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Prototype");
        ProductImpl lcdTv55 = new ProductImpl(10,"Arçelik", 1000,new Color("Kırmızı"));
        ProductImpl lcdTv43 = (ProductImpl) lcdTv55.clone();
        lcdTv43.getColor().setColorName("Yeşil");

        System.out.println("lcdTv55 Renk : " + lcdTv55.getColor().getColorName());
        System.out.println("lcdTv43 Renk : " + lcdTv43.getColor().getColorName());

        System.out.println("lcdTv55 Color Hash: "+lcdTv55.getColor().hashCode());
        System.out.println("lcdTv43 Color Hash: "+lcdTv43.getColor().hashCode());

        lcdTv43.setListPrice(600);
        System.out.println("lcdTv55 Price: "+lcdTv55.getListPrice());
        System.out.println("lcdTv43 Price: "+lcdTv43.getListPrice());

        System.out.println("lcdTv55 Hash: " +lcdTv55.hashCode());
        System.out.println("lcdTv43 Hash: " +lcdTv43.hashCode());
    }
}