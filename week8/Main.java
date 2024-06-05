package week8;

public class Main {
    public static void main(String[] args) {
        // String merek, jenis, setir, tipeBaterai;
        // int tahun, jmlRoda, kecepatan, cc, jmlBaterai, dayaMotor;

        Listrik mobilListrik = new Listrik("Wuling", 2021, 4, 80,"mpv", "kanan", 2, 140, "lithium");
        mobilListrik.getData();

        System.out.println(mobilListrik.getJmlRoda());
        mobilListrik.maju();

        Motor motor = new Motor("Honda", 2019, 2, 60, "Sport", 150);

        motor.maju();
    }
}
