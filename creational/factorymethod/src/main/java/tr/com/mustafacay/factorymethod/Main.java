package tr.com.mustafacay.factorymethod;

import tr.com.mustafacay.factorymethod.service.TransportType;
import tr.com.mustafacay.factorymethod.service.Transportation;
import tr.com.mustafacay.factorymethod.service.TransportationFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Factory Method" );
        //Kamyon oluşturma
        Transportation truck= TransportationFactory.createTransportation(TransportType.TRUCK);
        truck.deliver();
        //Gemi oluşturma
        Transportation ship=TransportationFactory.createTransportation(TransportType.SHIP);
        ship.deliver();
        //Otobüs oluşturma
        Transportation bus=TransportationFactory.createTransportation(TransportType.BUS);
        bus.deliver();


    }
}