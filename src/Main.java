package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Baþlangýçtaki Toplam Kitap Sayýsý: " + Kitap.getToplamKitapSayisi());

        Kitap kitap1 = new Kitap("978-0134685991", "Effective Java", "Joshua Bloch");
        Kitap kitap2 = new Kitap("978-0132350884", "Clean Code", "Robert C. Martin");

        System.out.println("Kitaplar Eklendikten Sonra Toplam Kitap Sayýsý: " + Kitap.getToplamKitapSayisi());

        KitapKopyasi kopya1 = new KitapKopyasi("KOPYA-001", kitap1);
        Kullanici kullanici1 = new Kullanici("U101", "Habibe Nida");

        System.out.println("\n--- ÖDÜNÇ ÝÞLEMÝ ---");
        OduncKaydi kayit = new OduncKaydi("REC-001", kullanici1, kopya1);

        System.out.println("Ödünç Alan: " + kayit.getKullanici().getAdSoyad());
        System.out.println("Kitap: " + kayit.getKitapKopyasi().getKitap().getBaslik());
        System.out.println("Durum (Ödünçte mi?): " + kopya1.isOduncDurumu());

        System.out.println("\n--- ÝADE ÝÞLEMÝ ---");
        kayit.kitapIadeEt();
        System.out.println("Durum (Ýade Sonrasý Ödünçte mi?): " + kopya1.isOduncDurumu());
    }
}