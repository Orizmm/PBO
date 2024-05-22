package week8;

public class Kendaraan {
    protected String merek;
    protected int tahun, jlmRoda, kecepatan;

    public Kendaraan(String merek, int tahun, int jmlRoda, int kecepatan){
        this.merek = merek;
        this.tahun = tahun;
        this.jlmRoda = jmlRoda;
        this.kecepatan = kecepatan;
    }

    public String getMerek(){
        return merek;
    }

    public int getTahun(){
        return tahun;
    }

    public int getJmlRoda(){
        return jlmRoda;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void hidupkanMesin(){
        System.out.println("Mesin dihidupkan");
    }

    public void maju(){
        System.out.println("Kendaraan maju 10m ke depan");
    }

    
}
