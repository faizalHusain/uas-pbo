public class Main {
    public static void main(String[] args) {
        // 2c, Deklarasi dan instansiasi objek dari kelas Mobil7, Mobil5, dan SepedaMotor
        Kendaraan motorBeat = new SepedaMotor();
        Kendaraan Avanza = new Mobil5();
        Kendaraan Xenia = new Mobil7();

        // 2d,pengisian nilai dan cara akses atribut dari objek
        motorBeat.setMaxPenumpang(1);
        motorBeat.setNamaPengendara("Arkan");
        motorBeat.setNoPlat("B 1234 ABC");
        Koleksi penumpang = motorBeat.getKoleksi();
        

        System.out.println("======= Sepeda Motor =======");
        System.out.println("pengendara motor = " + motorBeat.getNamaPengendara());
        System.out.println("plat motor = " + motorBeat.getNoPlat());
        System.out.println("max penumpang motor = " + motorBeat.getMaxPenumpang());
        penumpang.tambahKoleksi("1234567890", "Arkan");
        penumpang.tampilkanKoleksi();


        Avanza.setMaxPenumpang(4);
        Avanza.setNamaPengendara("Budi");
        Avanza.setNoPlat("D 1234 ABC");

        System.out.println("======= Mobil 5 =======");
        System.out.println("pengendara mobil = " + Avanza.getNamaPengendara());
        System.out.println("plat mobil = " + Avanza.getNoPlat());
        System.out.println("max penumpang mobil = " + Avanza.getMaxPenumpang());

        Xenia.setMaxPenumpang(6);
        Xenia.setNamaPengendara("Caca");
        Xenia.setNoPlat("E 1234 ABC");

        System.out.println("======= Mobil 7 =======");
        System.out.println("pengendara mobil = " + Xenia.getNamaPengendara());
        System.out.println("plat mobil = " + Xenia.getNoPlat());
        System.out.println("max penumpang mobil = " + Xenia.getMaxPenumpang());

    }
    
}
