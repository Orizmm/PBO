package week6;
import java.util.*;
import java.util.Iterator;


public class Tagihan {

    public static void main(String[] args) {
        int n;
        System.out.println("Jumlah Mahasiswa: ");

        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
       
        String nama, nim;
        int semester, sks;
        ArrayList<Mahasiswa> mhs = new ArrayList<>();
    
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-"+(i+1));
            System.out.print("Nama: ");
            nama = inp.next();
            System.out.println("NIM: ");
            nim = inp.next();
            System.out.print("Semester: ");
            semester = inp.nextInt();
            System.out.print("Sks: ");
            sks = inp.nextInt();

            mhs.add(new Mahasiswa(nama, nim, semester, sks));
        }

        System.out.println("\nDaftar Tagihan: ");

        Iterator<Mahasiswa> mahasiswa = mhs.iterator();
        while (mahasiswa.hasNext()){
            Mahasiswa m = mahasiswa.next();
            m.getData();
        }
        
    }

}
