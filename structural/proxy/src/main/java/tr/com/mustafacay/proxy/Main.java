package tr.com.mustafacay.proxy;

import tr.com.mustafacay.proxy.service.DosyaOkuma;
import tr.com.mustafacay.proxy.service.ProxyDosyaOkuma;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Proxy Design Pattern");

        // Dosya okuma proxy'si oluşturulur (maksimum dosya boyutu: 1MB)
        DosyaOkuma dosyaOkuma = new ProxyDosyaOkuma("README.md", 1024 * 1024);
        // Dosya okunur
        dosyaOkuma.dosyaOku();

    }
}