package perpus2;

import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Petugas(){
        this.namaKaryawan.add("Farel");
        this.alamat.add("Ambulu");
        this.telepon.add("089********");
        
        this.namaKaryawan.add("Anisa");
        this.alamat.add("Arjasa");
        this.telepon.add("081*********");
    }
    
    @Override
    public void setNama(String nama) {
        this.namaKaryawan.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaKaryawan.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    public void tampilKaryawan(){
        int n = this.namaKaryawan.size();
        for(int i = 0;i<n;i++){
            System.out.println("----------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
        }
    }
    
}