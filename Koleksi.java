import java.util.HashMap;
public class Koleksi {
    static HashMap<String,String> hashMapKoleksi;

    public Koleksi() {
        hashMapKoleksi = new HashMap<String, String>();
    }
    
    public void tambahKoleksi(String nik, String namaPenumpang) {
        hashMapKoleksi.put(nik, namaPenumpang);
    }

    public void hapusKoleksi(String nik) {
        hashMapKoleksi.remove(nik);
    }

    public void tampilkanKoleksi() {
        System.out.println("======= Koleksi =======");
        for (String key : hashMapKoleksi.keySet()) {
            System.out.println("nik = " + key);
            System.out.println("nama penumpang = " + hashMapKoleksi.get(key));
        }
    }
}
