package perpus1;

import java.util.ArrayList;

public class ListBuku {
    public ArrayList<Buku> list;

    public ListBuku() {
        list = new ArrayList<Buku>(); //inisiasi data list
        list.add(new Buku("TereLiye", 5, 9000, 1));
        list.add(new Buku("Tujuh kelana", 7, 10000, 2));
                
        
    }
    public void tampilBuku() {
        System.out.println("Daftar Buku");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getIdBuku()+"\t"+
                    list.get(i).getNamaBuku()+"\t"+
                    list.get(i).getHarga()+"\t"+
                    list.get(i).getStok());
        }
    }
    public Buku findBuku (int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getIdBuku()==id){
                return list.get(i);
            }
        }
        return null;
    }
    
    public void kurangiStok(int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getIdBuku()==id){
                int currentStok = list.get(i).getStok();
                list.get(i).setStok(currentStok - 1);
            }
        }
    }
}
