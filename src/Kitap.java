package src;

import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private static int toplamKitapSayisi = 0;
    private final String isbn;
    private String baslik;
    private String yazar;
    private final List<KitapKopyasi> kopyalar;

    public Kitap(String isbn, String baslik, String yazar) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
        this.kopyalar = new ArrayList<>();
        toplamKitapSayisi++;
    }

    public void kopyaEkle(KitapKopyasi kopya) {
        this.kopyalar.add(kopya);
    }

    public static int getToplamKitapSayisi() {
        return toplamKitapSayisi;
    }

    public String getIsbn() { return isbn; }
    public String getBaslik() { return baslik; }
    public void setBaslik(String baslik) { this.baslik = baslik; }
    public String getYazar() { return yazar; }
    public void setYazar(String yazar) { this.yazar = yazar; }
    public List<KitapKopyasi> getKopyalar() { return kopyalar; }
}