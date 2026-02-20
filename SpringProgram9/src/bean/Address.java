package bean;

public class Address {

	private int hno;
	private String city;
	private int pincode;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", vity=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
