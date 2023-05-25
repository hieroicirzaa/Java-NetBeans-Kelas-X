package minuman;

public class Minuman {

    private String rasa;
    private String bentuk;
    private String berisi;
    private int ukuran;
    public int harga;

    public void setBerisi(String berisi) {
        this.berisi = berisi;

    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

     public String getBerisi() {
         System.out.println("Berisi\t\t: "+berisi);
         return berisi;
    }
     
     public String getRasa() {
        System.out.println("Rasa\t\t: "+rasa);
        return rasa;
    }
     
     public String getBentuk() {
         System.out.println("Bentuk kemasan\t: "+bentuk);
         return bentuk;
    }
     
      public int getUkuran() {
        System.out.println("Ukuran\t\t: "+ukuran+" ml");
        return ukuran;
    }

    public void status() {
        System.out.println("Konidisi minuman\t: dingin");
    }

    public void setHarga(int harga){
        this.harga = harga ;  
        System.out.println("harga minuman\t: "+this.harga);
    }
}