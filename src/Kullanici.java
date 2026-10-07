package src;

import java.util.ArrayList;
import java.util.List;

public class Kullanici {
    private final String kullaniciId;
    private String adSoyad;
    private final List<OduncKaydi> oduncGecmisi;

    public Kullanici(String kullaniciId, String adSoyad) {
        this.kullaniciId = kullaniciId;
        this.adSoyad = adSoyad;
        this.oduncGecmisi = new ArrayList<>();
    }

    public void oduncKaydiEkle(OduncKaydi kayit) {
        this.oduncGecmisi.add(kayit);
    }

    public String getKullaniciId() { return kullaniciId; }
    public String getAdSoyad() { return adSoyad; }
    public void setAdSoyad(String adSoyad) { this.adSoyad = adSoyad; }
    public List<OduncKaydi> getOduncGecmisi() { return oduncGecmisi; }
}