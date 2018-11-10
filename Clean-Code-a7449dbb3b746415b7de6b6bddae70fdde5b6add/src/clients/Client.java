package clients;

import java.util.List;

import cakes.Cake;
import demo.Order;

public abstract class Client {
	
	protected String name;
	protected String telNumber;
	
	public Client(String name) {
		this.name = name;
	}
	
	public abstract Order makeOrder(List<Cake> cakes, String addres);
}
