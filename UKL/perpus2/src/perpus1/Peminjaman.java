package perpus1;

public class Peminjaman {
    private Siswa selectedSiswa;
    private Buku selectedBuku;
    private int banyak;

    public Siswa getSelectedSiswa() {
        return selectedSiswa;
    }

    public void setSelectedSiswa(Siswa selectedSiswa) {
        this.selectedSiswa = selectedSiswa;
    }

    public Buku getSelectedBuku() {
        return selectedBuku;
    }

    public void setSelectedBuku(Buku selectedBuku) {
        this.selectedBuku = selectedBuku;
    }

    public int getBanyak() {
        return banyak;
    }

    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }

    public Peminjaman(Siswa selectedSiswa, Buku selectedBuku, int banyak) {
        this.selectedSiswa = selectedSiswa;
        this.selectedBuku = selectedBuku;
        this.banyak = banyak;
    }
    
}
