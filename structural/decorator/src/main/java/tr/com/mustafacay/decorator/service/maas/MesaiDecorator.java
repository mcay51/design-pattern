package tr.com.mustafacay.decorator.service.maas;

/**
 * Mesai ödemesi decorator'u temel maaşa mesai ücreti ekleme
  */
public class MesaiDecorator extends MaasDecorator {
    private double ekstraMesai;

    public MesaiDecorator(MaasHesaplama maasHesaplama, double ekstraMesai) {
        super(maasHesaplama);
        this.ekstraMesai = ekstraMesai;
    }

    @Override
    public double hesaplaMaas() {
        // Temel maaşa mesai ücreti ekle
        System.out.println("Maaşa Extra Mesai Eklenecek");
        return super.hesaplaMaas() + ekstraMesai;
    }
}
