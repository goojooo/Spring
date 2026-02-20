package beans;

public class Student {

	private int rollno;
	private String name;
	private Adrress address;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adrress getAddress() {
		return address;
	}
	public void setAddress(Adrress address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Roll number: " + rollno);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
	}
}
