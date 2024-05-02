package inheritance;

class Person {
	protected String name;
	protected String address;
    protected String hobi;
	
	//Default Constructor
	public Person() {
		System.out.println("Nama: "+name);
		System.out.println("Alamat: "+address);
	}
	
	//Constructor dengan parameter
	public Person(String name,String address, String hobi) {
		this.name = name;
		this.address = address;
        this.hobi = hobi;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

    public String getHobi(){
        return hobi;
    }
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void job(String job)
	{
		System.out.println("Pekerjaan "+job);
	}
	
	public void identity()
	{
		System.out.println("Nama: "+getName());
		System.out.println("Alamat: "+getAddress());
		System.out.println("Hobi: "+getHobi());
	}
}
