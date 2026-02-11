package bean;

import java.time.LocalTime;

public class WishMessageGenerator {

	private LocalTime time; // has a type of property

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	// setter method for setter injection
	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time = time;
	}

	// bussiness method havinf
	public String generateWishMessage(String userName) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		// get current value
		int hour = time.getHour(); // 0-23
		if (hour < 12) {
			return "Good morning " + userName;
		} else if (hour < 16) {
			return "Good afternoon " + userName;
		} else if (hour < 20) {
			return "Good evening " + userName;
		} else {
			return "Good night " + userName;
		}
	}
}
