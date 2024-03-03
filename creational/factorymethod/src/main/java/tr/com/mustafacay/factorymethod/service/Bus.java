package tr.com.mustafacay.factorymethod.service;
//Otobüs sınıfı
public class Bus implements Transportation{
    @Override
    public void deliver() {
        System.out.println("Otobüs ile taşımacılık yapılıyor.");
    }
}
