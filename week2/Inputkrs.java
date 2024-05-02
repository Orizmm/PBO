package week2;

public class Inputkrs {
    public static void main(String[] args) {
        Krs krs1 = new Krs();

        krs1.setMatkul("PBO", 0);
        krs1.setMatkul("PWL", 1);
        krs1.setMatkul("Pemrograman Dasar", 2);

        krs1.setSks(4, 0);
        krs1.setSks(4, 1);
        krs1.setSks(4, 2);

        krs1.infoKrs();
    }
}
