package week6;

public class Mahasiswa {
    private String nama, nim;
    private int semester, sks, spp, tagihanSks;

    public Mahasiswa(String nama, String nim, int semester, int sks){
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.sks = sks;
        setTagihan(semester);
    }

    public void setTagihan(int semester){
        if (semester <= 2){
            tagihanSks = sks*300000;
            spp = 3000000;
        } else if (semester <= 6){
            tagihanSks = sks*275000;
            spp = 2900000;
        } else{
            tagihanSks = sks*250000;
            spp = 2750000;
        }
    }

    public void getData(){
        System.out.println("Nama: "+nama);
        System.out.println("Nim: "+nim);
        System.out.println("Semester: "+semester);
        System.out.println("Jumlah Sks: "+sks);
        System.out.println("Tagihan Sks: "+tagihanSks);
        System.out.println("Tagihan SPP: "+spp);
        System.out.println("Total tagihan: "+(tagihanSks+spp));
    }


}
