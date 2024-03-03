package tr.com.mustafacay.builder.service.director;

// Director sınıfı
public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() {
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        houseBuilder.buildDoor();
        houseBuilder.buildWindows();
        houseBuilder.buildExtras();
    }
}
