package perpus1;

import java.util.ArrayList;
import java.util.Scanner;

public class Perpus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean stay = true;
        Scanner input = new Scanner(System.in);
        
        // membuat array list siswa, petugas dan buku
        ListSiswa daftarSiswa = new ListSiswa(); 
        ListPetugas daftarPetugas = new ListPetugas();
        ListBuku daftarBuku = new ListBuku();
        
        ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<Peminjaman>();
        
        while (stay) {
            System.out.println("=================================");
            System.out.println("1. Tampil Siswa");
            System.out.println("2. Tampil Petugas");
            System.out.println("3. Tampil Buku");
            System.out.println("4. Peminjaman");
            System.out.println("5. Exit");
            System.out.print("pilih menu = ");

            int pilihan = input.nextInt();
            if (pilihan == 1) {
                
                daftarSiswa.tampilSiswa();
            } else if (pilihan == 2) {
                
                daftarPetugas.tampilPetugas();
            } else if (pilihan == 3) {
                
                daftarBuku.tampilBuku();
            }
            else if (pilihan == 4) {
                System.out.print("Masukkan id Siswa : ");
                int selectedIdSiswa = input.nextInt();
                Siswa selectedSiswa = daftarSiswa.findSiswa(selectedIdSiswa);
                if(selectedSiswa != null){
                    // jika ditemukan siswa berdasarkan id yg dimasukkan
                    if(selectedSiswa.getStatus()){
                        // jika status siswa aktif
                        System.out.println("Masukkan jumlah buku yang akan dipinjam");
                        int jumlahBuku = input.nextInt();
                        
                        // loop sejumlah buku yg akan dipinjam
                        for (int i = 0; i < jumlahBuku; i++) {
                            System.out.println("Masukkan id buku ke-" + (i+1));
                            int selectedIdBuku = input.nextInt();
                            Buku selectedBuku = daftarBuku.findBuku(selectedIdBuku);
                            if (selectedBuku != null) {
                                // jika buku ditemukan berdasarkan id buku
                                
                                // masukkan ke daftar peminjaman
                                daftarPeminjaman.add(new Peminjaman(selectedSiswa, selectedBuku, 1));
                                
                                // kurangi stok buku
                                daftarBuku.kurangiStok(selectedIdBuku);
                            }
                        }
                        
                        // disable status siswa
                        daftarSiswa.disableSiswa(selectedIdSiswa);
                        
                        // tampil list peminjaman
                        System.out.println("--- List Peminjaman ---");
                        System.out.println("Judul Buku \t \t Peminjam");
                        for (int i = 0; i < daftarPeminjaman.size(); i++) {
                            System.out.println(daftarPeminjaman.get(i).getSelectedBuku().getNamaBuku() + "\t \t " + 
                                    daftarPeminjaman.get(i).getSelectedSiswa().getNamaSiswa());
                        }
                    }
                    else {
                        // jika status siswa tidak aktif
                        System.out.println("Siswa tidak diperkenankan meminjam buku");
                    }
                }
                else {
                    // jika tidak ditemukan siswa berdasarkan id yg dimasukkan 
                    System.out.println("Siswa tidak ditemukan");
                }
            }
            else if (pilihan == 5) {
                System.out.println("Terimakasih telah berkunjung ke perpustakaan");
                break;
            }
        }

    }

}
