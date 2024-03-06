package tr.com.mustafacay.facade.service;

public class MerkezBanka implements KrediKullandir{
    @Override
    public boolean krediKullanabilirMi(Musteri musteri,double miktar) {
        // Merkez Bankası tarafından müşterinin kredi geçmişi kontrol edilir
        return true; // Örnek bir kontrol sonucu
    }
}
