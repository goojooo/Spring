package beans;

public class Adrress {

	private int housen;
	private String city;
	private int pincode;
	
	public int getHousen() {
		return housen;
	}
	public void setHousen(int housen) {
		this.housen = housen;
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
		
		return "#" + housen + " , " + city + " - " + pincode ;
	}
}
