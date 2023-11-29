/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi - Reg. Pagi
 * NIM      : 22166030
 */
class Koordinat {
    String warna;
    int x, y;

    void info() {
        System.out.println("Warna koordinat : " + warna);
        System.out.println("Koordinat sumbu x : " + x + ", y : " + y);
    }
}

public class PBOLat54 {
    public static void main(String[] args) {
        Koordinat koordinat = new Koordinat();
        koordinat.warna = "Jingga";
        koordinat.x = 10;
        koordinat.y = 4;

        koordinat.info();
    }
}
