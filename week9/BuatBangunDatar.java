package week9;

import java.util.Scanner;

public class BuatBangunDatar {
    public static void main(String[] args) {
        int pilih;
        int a, b, c;
        double x, y;
        BangunDatar bd = new BangunDatar(2, 4);
        BangunRuang br = new BangunRuang(2,4,4);

        Scanner inp = new Scanner(System.in);

        do{
            System.out.println("1. Persegi");
            System.out.println("2. Persegi panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Vol Kubus");
            System.out.println("6. Vol Balok");
            System.out.println("0. Exit");
            System.out.print("Pilihan: ");
            pilih = inp.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("panjang sisi: ");
                    a = inp.nextInt();
                    System.out.println("Luas persegi dengan sisi "+a+" adalah "+bd.luas(a));
                    System.out.println("Keliling persegi dengan sisi "+a+" adalah "+bd.keliling(a));
                    break;

                case 2:
                    System.out.print("panjang sisi: ");
                    a = inp.nextInt();
                    System.out.print("lebar sisi: ");
                    b = inp.nextInt();
                    System.out.println("luas persegi panjang dengan panjang "+a+" dan lebar "+b+" adalah "+bd.luas(a, b));
                    System.out.println("keliling persegi panjang dengan panjang "+a+" dan lebar "+b+" adalah "+bd.keliling(a, b));
                    break;

                case 3:
                    System.out.print("panjang alas: ");
                    x = inp.nextDouble();
                    System.out.println("panjang tinggi: ");
                    y = inp.nextDouble();
                    System.out.println("luas segitiga dengan alas "+x+" dan tinggi "+y+" adalah "+bd.luas(x, y));
                    break;

                case 4:
                    System.out.print("panjang diameter: ");
                    x = inp.nextDouble();
                    System.out.println("luas lingkaran dengan diameter "+x+" adalah "+bd.luas(x));
                    System.out.println("keliling lingkaran dengan diameter "+x+" adalah "+bd.keliling(x));
                    break;

                case 5:
                    System.out.print("panjang sisi: ");
                    a = inp.nextInt();
                    System.out.println("Volume kubus dengan sisi "+a+" adalah "+br.volume(a));
                    break;

                case 6:
                    System.out.print("panjang balok: ");
                    a = inp.nextInt();
                    System.out.print("lebar balok: ");
                    b = inp.nextInt();
                    System.out.print("tinggi balok: ");
                    c = inp.nextInt();
                    System.out.println("Volume balok dengan panjang "+a+", lebar "+b+", dan tinggi "+c+" adalah "+br.volume(a, b, c));
                    break;
                    

                case 0:
                    break;
            
                default:
                    System.out.println("pilihan tidak tersedia");
                    break;
            }
            System.out.println();
        }while(pilih != 0);


    }
}
