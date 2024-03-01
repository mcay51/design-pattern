package tr.com.mustafacay.factorymethod.service;
//Gemi Sınıfı
public class Ship implements Transportation{
    @Override
    public void deliver() {
        System.out.println("Gemi ile taşımacılık yapılıyor");
    }
}
