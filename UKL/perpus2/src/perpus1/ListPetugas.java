package perpus1;

import java.util.ArrayList;

public class ListPetugas {

    public ArrayList<Petugas> list;

    public ListPetugas() {
        list = new ArrayList<Petugas>(); //inisiasi data list
        list.add(new Petugas("Kemi", "Bojonegoro", "0851", 1));
        list.add(new Petugas("Ammar", "Surabaya", "0852", 2));
    }

    public void tampilPetugas() {
        System.out.println("Daftar Petugas");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getIdPetugas()+"\t"+
                    list.get(i).getNamaKaryawan()+"\t"+
                    list.get(i).getAlamat()+"\t"+
                    list.get(i).getTelepon());
        }
    }
}
