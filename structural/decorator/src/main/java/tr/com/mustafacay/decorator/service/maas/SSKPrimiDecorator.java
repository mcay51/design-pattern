package tr.com.mustafacay.decorator.service.maas;

public class SSKPrimiDecorator extends MaasDecorator {
    private double sskPrimOrani;
    public SSKPrimiDecorator(MaasHesaplama maasHesaplama, double sskPrimOrani) {
        super(maasHesaplama);
        this.sskPrimOrani = sskPrimOrani;
    }
    @Override
    public double hesaplaMaas(){
        System.out.println("Ssk Primi  düşülecek: ");

        return super.hesaplaMaas()*(1- sskPrimOrani);
    }
}