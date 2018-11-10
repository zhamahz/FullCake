package demo;
import java.util.HashSet;

public class Provider {
	
	private String name;
	private String phoneNumber;
	private HashSet<Order> orders = new HashSet<>();
	
	Provider(String name){
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashSet<Order> getOrders() {
		return orders;
	}

	public void setOrders(HashSet<Order> orders) {
		this.orders = orders;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
