package week7;
import java.time.LocalDate;
import java.time.Period;

import week1.Mahasiswa;

public class MahasiswaAktif extends Mahasiswa {
    
    private int usia, semester;

    public MahasiswaAktif(String nama, String nim, String tanggal_lahir, int semester) {
        super(nama, nim, tanggal_lahir);
        this.semester = semester;
    }
    
    // overriding
    public void getDataMhs(){
        System.out.println("Nama: "+super.getNama());
        System.out.println("NIM: "+super.getNIM());
        System.out.println("Tanggal Lahir: "+super.getTanggal_lahir());
        System.out.println("Semester: "+getSemester());
        System.out.println("Usia: "+getUsia());
    }

    public int getSemester(){
        return semester;
    }
    
    public String getUsia(){
        String tgl_lahir = super.getTanggal_lahir();
        String tgl = tgl_lahir.substring(0,2);//01-12-2004
        String bln = tgl_lahir.substring(3,5);
        String thn = tgl_lahir.substring(6);

        LocalDate today = LocalDate.now();
        LocalDate birtdate = LocalDate.of(Integer.parseInt(thn), Integer.parseInt(bln), Integer.parseInt(tgl));

        // LocalDate birtdate = LocalDate.of

        int tahun = Period.between(birtdate, today).getYears();
        int bulan = Period.between(birtdate, today).getMonths();
        // int hari = Period.between(birtdate, today).getDays();

        return Integer.toString(tahun)+" Tahun " + Integer.toString(bulan)+" Bulan";
    }
}