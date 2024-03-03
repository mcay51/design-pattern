package tr.com.mustafacay.builder;

import tr.com.mustafacay.builder.service.build.House;

import tr.com.mustafacay.builder.service.director.Director;
import tr.com.mustafacay.builder.service.director.HouseBuilder;
import tr.com.mustafacay.builder.service.director.SimpleHouseBuilder;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Builder build örneği");
        House house = new House.Builder()
                .walls("Brick")
                .roof("Tile")
                .door("Wooden")
                .windows("Double-glazed")
                .extras("Swimming pool")
                .build();

        System.out.println("1. Örnek build :  "+house);

        System.out.println("===========================================================");

        HouseBuilder simpleHouseBuilder = new SimpleHouseBuilder();
        Director director = new Director(simpleHouseBuilder);

        director.constructHouse();
        tr.com.mustafacay.builder.service.director.House simpleHouse = simpleHouseBuilder.getHouse();
        System.out.println("2. Örnek Director -> Simple House: " + simpleHouse);
    }
}