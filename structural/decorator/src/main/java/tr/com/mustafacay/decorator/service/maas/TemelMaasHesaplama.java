package tr.com.mustafacay.decorator.service.maas;

/**
 * Temel maaş hesaplama sınıfı
  */
public class TemelMaasHesaplama implements MaasHesaplama {
    private double temelMaas;

    public TemelMaasHesaplama(double temelMaas) {
        this.temelMaas = temelMaas;
    }

    @Override
    public double hesaplaMaas() {
        return temelMaas;
    }
}
