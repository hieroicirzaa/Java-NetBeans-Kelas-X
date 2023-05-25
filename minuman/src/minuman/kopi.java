package minuman;

public class kopi extends Minuman {

    public void status() {
        System.out.println("konidisi minuman\t: hangat");
    }

    public void setHarga(int harga, int diskon) {
        System.out.println("harga asli\t: Rp." + harga);
        System.out.println("nominal diskon\t: Rp." + diskon);
        super.harga = harga - diskon;
        System.out.println("total harga\t: Rp." + super.harga);
    }
}
