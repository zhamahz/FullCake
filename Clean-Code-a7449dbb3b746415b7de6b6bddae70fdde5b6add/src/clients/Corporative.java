package clients;

import java.util.List;

import cakes.Cake;
import demo.Order;

public class Corporative extends Client {
	private boolean hasDiscount;
	public Corporative(String name) {
		super(name);
	}

	@Override
	public Order makeOrder(List<Cake> cakes, String addres) {
		Order order = new Order(this, cakes, addres, this.hasDiscount);
		return order;
	}

	public boolean isHasDiscount() {
		return hasDiscount;
	}

	public void setHasDiscount(boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}

}
