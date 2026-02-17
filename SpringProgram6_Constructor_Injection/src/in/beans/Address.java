package in.beans;

public class Address {
	private int hno;
	private String city;
	private int pincode;
	
	public Address(int hno, String city , int pincode)
	{
		this.hno = hno;
		this.city = city;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "House No. " + hno + " " + city + " - " + pincode;
	}
	

}
