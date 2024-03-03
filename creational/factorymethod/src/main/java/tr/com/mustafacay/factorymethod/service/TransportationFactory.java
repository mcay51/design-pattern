package tr.com.mustafacay.factorymethod.service;
// Belirli bir türde taşıma aracı oluşturmak için fabrika metodunun bulunduğu sınıf
public class TransportationFactory {
    //Belirli bir türde taşıma aracı oluşturmak için fabrika metodu
    public static Transportation createTransportation(TransportType transportType){
        switch (transportType) {
            case TRUCK -> {
                return new Truck();
            }
            case SHIP -> {
                return  new Ship();
            }
            case BUS -> {
                return new Bus();
            }
            default -> {
                throw new IllegalArgumentException("Geçersiz taşıma aracı türü: " + transportType);
            }
        }
    }
}
