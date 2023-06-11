
public class Kendaraan {
    private String noPlat;
    private String namaPengendara;
    private int maxPenumpang;
    // atribut koleksi
    // private Koleksi<Kendaraan> koleksi = new Koleksi<>();
   

    // deklarasi dan instansiasi kelas Koleksi dalam konstruktor kelas Kendaraan
    public Kendaraan() {
       // tambahkan koleksi
    //    koleksi = new Koleksi<Kendaraan>();
    }


    public void setMaxPenumpang(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }
    public void setNamaPengendara(String namaPengendara) {
        this.namaPengendara = namaPengendara;
    }
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
    public int getMaxPenumpang() {
        return maxPenumpang;
    }
    public String getNamaPengendara() {
        return namaPengendara;
    }
    public String getNoPlat() {
        return noPlat;
    }   

    public void infoKendaraan(){
        System.out.println("Nama Pengendara: " + namaPengendara);
        System.out.println("No Plat: " + noPlat);
        System.out.println("Max Penumpang: " + maxPenumpang);

    }

}
