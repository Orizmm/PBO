package week8;

public class Mobil extends Kendaraan {
    protected String jenis, setir;

    public Mobil(String merek, int tahun, int jmlRoda, int kecepatan, String jenis, String setir){
        super(merek, tahun, jmlRoda, kecepatan);
        this.jenis = jenis;
        this.setir = setir;
    }

    public String getJenis(){
        return jenis;
    }

    public String getSetir(){
        return setir;
    }

    public void maju(){
        System.out.println("mobil maju 10m ke depan");
    }
}
