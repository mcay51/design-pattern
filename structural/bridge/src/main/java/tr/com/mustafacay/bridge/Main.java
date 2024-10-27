package tr.com.mustafacay.bridge;

import tr.com.mustafacay.bridge.service.*;

public class Main {

public static void main(String[] args) {
        System.out.println("Hello world! Bridge Design Pattern");
        // Çemberin rengi kırmızı olan bir şekil çiziliyor
        ShapeWithColor redCircle = new ColoredShape(new Circle(), new Red());
        redCircle.drawShape();

        // Karenin rengi mavi olan bir şekil çiziliyor
        ShapeWithColor blueSquare = new ColoredShape(new Square(), new Blue());
        blueSquare.drawShape();
    }
}