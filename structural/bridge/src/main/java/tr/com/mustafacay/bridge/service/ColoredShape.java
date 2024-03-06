package tr.com.mustafacay.bridge.service;

/**
 * Renkleri içeren şekil sınıfı
 * renk ve şekil sınıfları ayrı olarak işlenirken,
 * ColoredShape sınıfı bu iki hiyerarşiyi birleştirir.
 * Bu, herhangi bir şeklin herhangi bir renk ile eşleştirilebileceği esnek bir yapı sağlar.
  */
public class ColoredShape extends ShapeWithColor {
    public ColoredShape(Shape shape, Color color) {
        super(color);
        this.shape = shape;
    }

    private Shape shape;

    @Override
    public void drawShape() {
        shape.draw();
        System.out.println("Renk: " + color.fill());
    }
}