package perpus1;

public class Siswa {

    private String namaSiswa;
    private String alamat;
    private String telepon;
    private Boolean status;
    private int idSiswa;

    public Siswa(String namaSiswa, String alamat, String telepon, Boolean status, int idSiswa) {
        this.namaSiswa = namaSiswa;
        this.alamat = alamat;
        this.telepon = telepon;
        this.status = status;
        this.idSiswa = idSiswa;
    }
    
    

    public int getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(int idSiswa) {
        this.idSiswa = idSiswa;
    }

    public String getNamaSiswa() {
        return namaSiswa;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
}
