package inheritance;

import java.util.Scanner;

public class InheritMain {

	public static void main(String[] args) {
        String name, address, hobi, nim;
        int spp, sks, modul;

        // object scanner
        Scanner input = new Scanner(System.in);

        // input data
        System.out.println("## Masukkan data ##");
        System.out.print("Nama: ");
        name = input.next();
        System.out.print("Alamat: ");
        address = input.next();
        System.out.print("Hobi: ");
        hobi = input.next();
        System.out.print("NIM: ");
        nim = input.next();
        System.out.print("Pembayaran SPP: ");
        spp = input.nextInt();
        System.out.print("Jumlah SKS: ");
        sks = input.nextInt();
        System.out.print("Jumlah Modul: ");
        modul = input.nextInt();

        // object dari class Student
        Student mahasiswa = new Student(name, address, hobi, nim);
        
        // menampilkan data
        System.out.println("\n## Data Mahasiswa ##");
        mahasiswa.identity();

        // total pembayaran
        System.out.println("Total Pembayaran: "+mahasiswa.hitungPembayaran(spp, sks, modul));
	}

}