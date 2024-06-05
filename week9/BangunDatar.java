package week9;

public class BangunDatar {
    private int panjang;
    private int lebar;
    private int sisi;
    private static final double pi = 3.14;

    public BangunDatar(int sisi){
        this.sisi = sisi;
    }

    public BangunDatar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luas(int a){
        return a*a;
    }

    public int luas(int a, int b){
        return a*b;
    }

    public double luas(double a){
        return (pi*a*a)/4;  //phi*D^2/4
    }

    public double luas(double a, double t){
        return (a*t)/2;
    }

    public int keliling(int s){
        return 4*s;
    }

    public int keliling(int p, int l){
        return 2*(p+l);
    }

    public double keliling(double d){
        return pi*d;
    }
    
    public int getSisi(){
        return sisi;
    }

    public int getPanjang(){
        return panjang;
    }

    public int getLebar(){
        return lebar;
    }
}
