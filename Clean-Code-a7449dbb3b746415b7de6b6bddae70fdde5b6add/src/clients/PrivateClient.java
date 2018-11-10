package clients;

import java.util.List;

import cakes.Cake;
import demo.Order;


public class PrivateClient extends Client{
	
	public PrivateClient(String name) {
		super(name);
	}
	
	@Override
	public Order makeOrder(List<Cake> cakes, String addres) {
		Order order = new Order(this, cakes, addres, false);
		return order;
	}

}
