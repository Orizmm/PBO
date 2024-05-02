package week7;
import week1.Mahasiswa;

public class AksiMahasiswa {

    public static void main(String[] args) {
        MahasiswaAktif mhs1 = new MahasiswaAktif("Eko", "14097", "18-03-2004", 4);
        mhs1.getDataMhs();

        Mahasiswa mhs2 = new Mahasiswa("joko", "13098", "01-12-2003");
        mhs2.getDataMhs();
    }
}