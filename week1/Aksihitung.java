package week1;

public class Aksihitung {
    
    public static void main(String[] args) {
        // keliling lingkaran
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Keliling lingkaran dengan diameter "+ lingkaran.diameter+" adalah "+String.format("%.2f",lingkaran.keliling()));

        // luas segitiga
        Segitiga segitiga = new Segitiga();
        System.out.println("Luas segitiga siku-siku dengan alas "+segitiga.alas+" dan tinggi "+segitiga.tinggi+ " adalah "+String.format("%.2f",segitiga.luas()));

        // volume tabung
        Tabung tabung = new Tabung();
        System.out.println("Volume tabung dengan diameter "+tabung.jari*2+" dan tinggi "+tabung.tinggi+" adalah "+String.format("%.2f",tabung.volume()));
    }
}
