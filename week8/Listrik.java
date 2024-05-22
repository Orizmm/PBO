package week8;

public class Listrik extends Mobil{
    private int jmlBaterai, dayaMotor;
    private String tipeBaterai;

    public Listrik(String merek, int tahun, int jmlRoda, int kecepatan, String jenis, String setir, int jmlBaterai, int dayaMotor, String tipeBaterai){
        super(merek, tahun, jmlRoda, kecepatan, jenis, setir);
        this.jmlBaterai = jmlBaterai;
        this.dayaMotor = dayaMotor;
        this.tipeBaterai = tipeBaterai;
    }

    public int getJmlBaterai(){
        return jmlBaterai;
    }

    public int getDayaMotor(){
        return dayaMotor;
    }

    public String getTipeBaterai(){
        return tipeBaterai;
    }

    public void mengisiBaterai(){
        System.out.println("Mobil sedang mengisi baterai");
    }

    public void getData(){
        super.getData();
        System.out.println("Jumlah Baterai: "+getJmlBaterai());
        System.out.println("Daya Motor: "+getDayaMotor());
        System.out.println("Tipe Baterai: "+getTipeBaterai());
    }
}
