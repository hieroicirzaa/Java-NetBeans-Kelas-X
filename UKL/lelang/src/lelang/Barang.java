package lelang;

import java.util.ArrayList;

public class Barang {

    private ArrayList<String> Barang = new ArrayList<String>();
    private ArrayList<Integer> HargaAwal = new ArrayList<Integer>();
    private ArrayList<Integer> Masyarakat = new ArrayList<Integer>();
    private ArrayList<Boolean> Status = new ArrayList<Boolean>();

    public Barang() {
        Barang.add("Rumah 15x20m");
        HargaAwal.add(9000);
        Status.add(false);

        Barang.add("iPhone 6 Pink Diamond");
        HargaAwal.add(7000);
        Status.add(false);

        Barang.add("MacBook Pro");
        HargaAwal.add(1000);
        Status.add(false);
        
        Masyarakat.add(0);
        Masyarakat.add(1);
        Masyarakat.add(2);
    }

    public void setBarang(String Barang) {
        this.Barang.add(Barang);
    }

    public String getBarang(int id) {
        return this.Barang.get(id);
    }

    public void setStatus(int IdNamaBarang, boolean Status) {
        this.Status.add(IdNamaBarang, Status);
    }

    public boolean getStatus(int IdBarang) {
        return this.Status.get(IdBarang);
    }

    public void setHarga(int Harga) {
        this.HargaAwal.add(Harga);
    }

    public int getHarga(int Id) {
        return this.HargaAwal.get(Id);
    }

    public void Remove(int IdBarang) {
        this.Barang.remove(Barang);
    }
}
