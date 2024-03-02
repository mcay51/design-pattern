package tr.com.mustafacay.builder.service.build;
// House sınıfı
public class House {
    private final String walls;
    private final String roof;
    private final String door;
    private final String windows;
    private final String extras;

    private House(Builder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.door = builder.door;
        this.windows = builder.windows;
        this.extras = builder.extras;
    }
    //Builder sınıfı
    public static class Builder {
        private String walls;
        private String roof;
        private String door;
        private String windows;
        private String extras;
        public Builder(){
        }
        public Builder walls(String walls) {
            this.walls = walls;
            return this;
        }
        public Builder roof(String roof) {
            this.roof = roof;
            return this;
        }
        public Builder door(String door) {
            this.door = door;
            return this;
        }
        public Builder windows(String windows) {
            this.windows = windows;
            return this;
        }
        public Builder extras(String extras) {
            this.extras = extras;
            return this;
        }
        public House build() {
            return new House(this);
        }

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
