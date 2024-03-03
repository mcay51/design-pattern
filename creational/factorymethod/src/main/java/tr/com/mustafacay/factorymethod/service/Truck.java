package tr.com.mustafacay.factorymethod.service;
//Kamyon Sınıfı
public class Truck implements Transportation{
    @Override
    public void deliver() {
        System.out.println("Kamyon ile taşımacılık yapılıyor");
    }
}
