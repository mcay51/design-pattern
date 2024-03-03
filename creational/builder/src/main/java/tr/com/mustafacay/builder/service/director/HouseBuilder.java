package tr.com.mustafacay.builder.service.director;

// Builder arayüzü
public interface HouseBuilder {
    void buildWalls();
    void buildRoof();
    void buildDoor();
    void buildWindows();
    void buildExtras();
    House getHouse();
}
