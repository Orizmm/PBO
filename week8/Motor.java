package week8;

public class Motor extends Kendaraan {
    protected String jenis;
    protected int cc;

    public Motor(String merek, int tahun, int jmlRoda, int kecepatan, String jenis, int cc){
        super(merek, tahun, jmlRoda, kecepatan);
        this.jenis = jenis;
        this.cc = cc;
    }

    public String getJenis(){
        return jenis;
    }

    public int getCc(){
        return cc;
    }

    public void maju(){
        System.out.println("Motor maju 10m ke depan");
    }
}
