package tr.com.mustafacay.bridge.odemesistemi;

import tr.com.mustafacay.bridge.odemesistemi.service.*;

public  class Main {
    public static void main(String[] args) {
        Banka isBankasi = new IBankasi();
        Banka ziraatBankasi = new ZBankasi();

        Odeme krediKartiOdeme = new KrediKartiOdeme(isBankasi, 500.0);
        Odeme havaleOdeme = new HavaleOdeme(ziraatBankasi, 1000.0);

        krediKartiOdeme.islemiGerceklestir(); // İş Bankası üzerinden Kredi Kartı ödemesi
        havaleOdeme.islemiGerceklestir();     // Ziraat Bankası üzerinden Havale ödemesi
    }
}
