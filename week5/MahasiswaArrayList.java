package week5;
import week1.Mahasiswa;
import java.util.*;

public class MahasiswaArrayList {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Budi", "14097");
        mhs.insertNilai(86.0);
        mhs.insertNilai(90.0);
        mhs.insertNilai(85.0);
        mhs.insertNilai(81.0);
        mhs.insertNilai(93.5);
        mhs.insertMatkul("PBO", "4221", 4);
        mhs.insertMatkul("SBD", "4211", 2);
        mhs.insertMatkul("IMK", "4215", 3);
        mhs.dataMhs();
    }
}

