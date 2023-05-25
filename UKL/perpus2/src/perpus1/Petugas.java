package perpus1;


public class Petugas {
    private String namaKaryawan;
    private String alamat;
    private String telepon;
    private int idPetugas;

    public Petugas(String namaKaryawan, String alamat, String telepon, int idPetugas) {
        this.namaKaryawan = namaKaryawan;
        this.alamat = alamat;
        this.telepon = telepon;
        this.idPetugas = idPetugas;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public int getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(int idPetugas) {
        this.idPetugas = idPetugas;
    }
   
    
}
