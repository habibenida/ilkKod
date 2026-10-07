package src;

import java.time.LocalDate;

public class OduncKaydi {
    private final String kayitId;
    private final LocalDate almaTarihi;
    private LocalDate iadeTarihi;
    private final Kullanici kullanici;
    private final KitapKopyasi kitapKopyasi;

    public OduncKaydi(String kayitId, Kullanici kullanici, KitapKopyasi kitapKopyasi) {
        this.kayitId = kayitId;
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;
        this.almaTarihi = LocalDate.now();
        this.iadeTarihi = null;

        kitapKopyasi.setOduncDurumu(true);
        kullanici.oduncKaydiEkle(this);
    }

    public void kitapIadeEt() {
        this.iadeTarihi = LocalDate.now();
        this.kitapKopyasi.setOduncDurumu(false);
    }

    public String getKayitId() { return kayitId; }
    public LocalDate getAlmaTarihi() { return almaTarihi; }
    public LocalDate getIadeTarihi() { return iadeTarihi; }
    public void setIadeTarihi(LocalDate iadeTarihi) { this.iadeTarihi = iadeTarihi; }
    public Kullanici getKullanici() { return kullanici; }
    public KitapKopyasi getKitapKopyasi() { return kitapKopyasi; }
}