package inheritance;

public class Student extends Person{
	String nim;
	int spp, sks, modul;

	public Student() {
		System.out.println("Inside Student:Constructor");
		super.name="Anda";
	}

    public Student(String name, String address, String hobi, String nim){
        super(name, address, hobi);
        this.nim = nim;
    }
	
	public String getNim()
	{
		return nim;
	}

	public int getSPP(){
		return spp;
	}

	public int getSKS(){
		return sks;
	}

	public int getModul(){
		return modul;
	}
	
	@Override
	public void identity()
	{
        super.identity();
        System.out.println("NIM: "+getNim());
		// System.out.println("Nama: "+super.name);
		// System.out.println("Alamat: "+super.address);
	}

    public int hitungPembayaran(int spp, int sks, int modul){
        this.spp = spp;
		this.sks = sks*250000;
		this.modul = modul*100000;
		
		return getSPP()+getSKS()+getModul();
    }		
}