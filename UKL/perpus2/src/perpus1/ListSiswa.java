package perpus1;

import java.util.ArrayList;

public class ListSiswa {

    public ArrayList<Siswa> list;

    public ListSiswa() {
        list = new ArrayList<Siswa>(); //inisiasi data list
        list.add(new Siswa("Irza", "Jember", "0851", true, 1));
        list.add(new Siswa("Dzaky", "Jombang", "0852", true, 2));
    }

    public void tampilSiswa() {
        System.out.println("Daftar Siswa");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getIdSiswa()+"\t"+
                    list.get(i).getNamaSiswa()+"\t"+
                    list.get(i).getAlamat()+"\t"+
                    list.get(i).getTelepon()+"\t"+
                    list.get(i).getStatus());
        }
    }
    public Siswa findSiswa (int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getIdSiswa()==id){
                return list.get(i);
            }
        }
        return null;
    }
    
    public void disableSiswa(int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getIdSiswa()==id){
                list.get(i).setStatus(false);
            }
        }
    }
}
