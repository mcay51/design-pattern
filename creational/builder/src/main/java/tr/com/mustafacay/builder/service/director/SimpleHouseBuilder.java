package tr.com.mustafacay.builder.service.director;

import lombok.Getter;

// Concrete Builder sınıfı
public class SimpleHouseBuilder implements HouseBuilder {
    @Getter
    private House house;

    public SimpleHouseBuilder() {
        this.house = new House("Simple walls", "Simple roof", "Simple door", "Simple windows", "No extras");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Simple walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Simple roof");
    }

    @Override
    public void buildDoor() {
        house.setDoor("Simple door");
    }

    @Override
    public void buildWindows() {
        house.setWindows("Simple windows");
    }

    @Override
    public void buildExtras() {
        house.setExtras("No extras");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
