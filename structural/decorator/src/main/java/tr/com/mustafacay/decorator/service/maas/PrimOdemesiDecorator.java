package tr.com.mustafacay.decorator.service.maas;

/**
 * Ekstra prim ödemesi decorator'u
  */
public class PrimOdemesiDecorator extends MaasDecorator {
    private double ekstraPrim;

    public PrimOdemesiDecorator(MaasHesaplama maasHesaplama, double ekstraPrim) {
        super(maasHesaplama);
        this.ekstraPrim = ekstraPrim;
    }

    @Override
    public double hesaplaMaas() {
        // Temel maaşa ekstra primi ekle
        System.out.println("Maaşa Ekstra Prim Eklenecek");
        return super.hesaplaMaas() + ekstraPrim;
    }
}
