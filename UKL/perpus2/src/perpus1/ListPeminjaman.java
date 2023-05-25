package perpus1;

import java.util.ArrayList;


public class ListPeminjaman {
    public ArrayList<Peminjaman> list;

    public ListPeminjaman() {
        list = new ArrayList<Peminjaman>();
    }
    
    public void tambahPeminjaman(Siswa siswa, Buku buku, int banyak){
        list.add(new Peminjaman(siswa, buku, banyak));
        
    }
    public void tampilPeminjaman(){
        System.out.println("Daftar Peminjaman : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getSelectedSiswa().getNamaSiswa()+"\t"+
                    list.get(i).getSelectedBuku().getNamaBuku()+"\t"+
                    list.get(i).getBanyak());
        }
    }
}
