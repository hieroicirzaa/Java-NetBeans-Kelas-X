package minuman;


public class jus extends Minuman{
    
    public void status (){
        System.out.println("konidisi minuman\t: dingin");
    }
    
     public void setHarga(int harga){
        super.harga = harga ;  
        System.out.println("harga minuman\t: Rp."+super.harga);
    }
}