package week9;

public class BangunRuang extends BangunDatar{
    private int tinggi, diameter;

    public BangunRuang(int panjang, int lebar, int tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public BangunRuang(int panjang, int lebar, int tinggi, int diameter){
        super(panjang, lebar);
        this.tinggi = tinggi;
        this.diameter = diameter;
    }

    public int volume(int sisi){
        return sisi*sisi*sisi;
    }

    public int volume(int panjang, int lebar, int tinggi){
        return panjang*lebar*tinggi;
    }
}