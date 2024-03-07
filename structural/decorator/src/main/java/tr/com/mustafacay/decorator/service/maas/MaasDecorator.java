package tr.com.mustafacay.decorator.service.maas;

/**
 * Decorator sarmalayıcı sınıfı
  */
public abstract class MaasDecorator implements MaasHesaplama {
    protected MaasHesaplama maasHesaplama;

    public MaasDecorator(MaasHesaplama maasHesaplama) {
        this.maasHesaplama = maasHesaplama;
    }

    @Override
    public double hesaplaMaas() {
        return maasHesaplama.hesaplaMaas();
    }
}