package tr.com.mustafacay.bridge.service;

/**
 * Soyutlanmış sınıf
  */
public abstract class ShapeWithColor {
    protected Color color;

    public ShapeWithColor(Color color) {
        this.color = color;
    }

    public abstract void drawShape();
}
