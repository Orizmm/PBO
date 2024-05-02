package week1;
import week5.Matakuliah;
import java.util.ArrayList;
import java.util.Iterator;

public class Mahasiswa {

    protected String nama, nim, tanggal_lahir;
    private ArrayList<Double> nilai = new ArrayList<>();
    private ArrayList<Matakuliah> mk = new ArrayList<>();
    
    public Mahasiswa(String nama, String nim){
        this.nim = nim;
        this.nama = nama;
    }
    public Mahasiswa(String nama, String nim, String tanggal_lahir){
        this.nim = nim;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getNama(){
        return nama;
    }

    public String getNIM(){
        return nim;
    }

    public String getTanggal_lahir(){
        return tanggal_lahir;
    }

    public void insertNilai(double n1){
        nilai.add(n1);
    }

    public void insertMatkul(String nama, String kelompok, int sks){
        mk.add(new Matakuliah(nama, kelompok, sks));
    }

    public void sayHello(){
        System.out.println("Halo nama saya adalah "+nama);
        // System.out.println("Saya adalah mahasiswa "+prodi+" "+univ);
        System.out.println("Saya sedang menulis program Java");
    }

    public void dataMhs(){
        System.out.println("NIM: "+nim);
        System.out.println("Nama: "+nama);
        getNilai();
        getMatkul();
        // System.out.println("NIM: "+ipk);
    }

    public void getDataMhs(){
        System.out.println("NIM: "+getNIM());
        System.out.println("Nama: "+getNama());
        System.out.println("Tanggal Lahir: "+getTanggal_lahir());
    }

    public void getNilai(){
        Iterator<Double> it = nilai.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+", ");
        }
    }

    public void getMatkul(){
        System.out.println("\nDaftar Mata Kuliah: ");
        Iterator<Matakuliah> matkul = mk.iterator();
        while (matkul.hasNext()) {
            Matakuliah m = matkul.next();
            System.out.println(m.getNama()+" - "+m.getKelompok()+" - "+m.getSks());
        }
    }
}