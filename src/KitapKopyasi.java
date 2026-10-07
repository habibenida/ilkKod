package src;

public class KitapKopyasi {
    private final String barkod;
    private boolean oduncDurumu;
    private final Kitap kitap;

    public KitapKopyasi(String barkod, Kitap kitap) {
        this.barkod = barkod;
        this.kitap = kitap;
        this.oduncDurumu = false;
        kitap.kopyaEkle(this);
    }

    public String getBarkod() { return barkod; }
    public boolean isOduncDurumu() { return oduncDurumu; }
    public void setOduncDurumu(boolean oduncDurumu) { this.oduncDurumu = oduncDurumu; }
    public Kitap getKitap() { return kitap; }
}