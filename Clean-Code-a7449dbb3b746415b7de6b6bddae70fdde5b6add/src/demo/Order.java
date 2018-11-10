package demo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cakes.Cake;
import clients.Client;

public class Order {

	private Client client;
	private BigDecimal price;
	private String address;
	private List<Cake> cakes = new ArrayList<>();
	private Date date;
	
	public Order(Client client, List<Cake> cakes, String address, boolean hasDiscount) {
		this.client = client;
		this.cakes = cakes;
		this.date = new Date();
		this.calculatePrice(cakes);
		if(hasDiscount){
			this.setPrice(this.price.subtract(new BigDecimal("10")));
		}
	}
	
	private void calculatePrice(List<Cake> cakes){

		for(Cake cake: this.cakes) {
			this.setPrice(this.price.add(cake.getPrice()));
		}
		
	}
	
	public boolean validateOrder(SweetShop shop) {
		boolean isOrderValid = true;
		for(Cake cake: cakes) {
			if(shop.getCakeAmount(cake.getName(), cake.getType()) == 0) {
				isOrderValid = false;
			}
		}
		return isOrderValid;	
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;	
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
