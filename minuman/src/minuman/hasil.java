package minuman;

public class hasil {
    
    public static void main(String[] args) {
        jus jeruk = new jus();
        jeruk.setBentuk("botol");
        jeruk.setBerisi("jus buah");
        jeruk.setRasa("rasa buah jeruk");
        jeruk.setUkuran(350);
        

        jeruk.getBentuk();
        jeruk.getBerisi();
        jeruk.getRasa();
        jeruk.getUkuran();        
        jeruk.status();
        jeruk.setHarga(12000);
        
        System.out.println("=========================================");
                
        kopi kopsus = new kopi ();
        kopsus.setBentuk("kaleng");
        kopsus.setBerisi("kopi susu");
        kopsus.setRasa("rasa cappuchino");
        kopsus.setUkuran(240);
        
        kopsus.getBentuk();
        kopsus.getBerisi();
        kopsus.getRasa();
        kopsus.getUkuran();        
        kopsus.status();
        kopsus.setHarga(20000, 5000);
    }
         
}