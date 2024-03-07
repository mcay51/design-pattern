package tr.com.mustafacay.decorator.service.maas;

public class GelirVergisiDecorator extends MaasDecorator {
    private double gelirVergisiOrani;
    public GelirVergisiDecorator(MaasHesaplama maasHesaplama, double gelirVergisiOrani) {
        super(maasHesaplama);
        this.gelirVergisiOrani = gelirVergisiOrani;
    }
    @Override
    public double hesaplaMaas(){
        System.out.println("Gelir vergisi düşülecek: ");

        return super.hesaplaMaas()*(1-gelirVergisiOrani);
    }
}
