package tr.com.mustafacay.builder.service.director;

import lombok.Getter;
import lombok.Setter;

// Ev sınıfı
@Getter
@Setter
public class House {
    private String walls;
    private String roof;
    private String door;
    private String windows;
    private String extras;

    public House(String walls, String roof, String door, String windows, String extras) {
        this.walls = walls;
        this.roof = roof;
        this.door = door;
        this.windows = windows;
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", door='" + door + '\'' +
                ", windows='" + windows + '\'' +
                ", extras='" + extras + '\'' +
                '}';
    }
}
