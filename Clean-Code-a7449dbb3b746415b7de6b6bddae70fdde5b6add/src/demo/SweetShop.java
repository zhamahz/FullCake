package demo;

import java.util.ArrayList;
import java.util.List;

import cakes.Cake;
import cakes.CakeType;
import cakes.SpecialCake;
import cakes.StandardCake;
import cakes.WeddingCake;

public class SweetShop {

	private String name;
	private String address;
	private String phoneNumber;
	private List<Provider> providers;
	private List<Cake> cakes;

	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}

	public List<Cake> getCakes() {
		return cakes;
	}

	public void setCakes(List<Cake> cakes) {
		this.cakes = cakes;
	}

	public SweetShop(String name) {
		this.setName(name);
		this.cakes = new ArrayList<Cake>();
		this.providers = new ArrayList<Provider>();
	}

	public void makeStandardCake(StandardCake cake) {
		this.cakes.add(cake);
	}

	public void makeSpecialdCake(SpecialCake cake) {
		this.cakes.add(cake);
	}
	
	public void makeWeddingCake(WeddingCake cake) {
		this.cakes.add(cake);
	}

	public void addProvider(Provider p) {
		this.providers.add(p);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getCakeAmount(String name, CakeType type) {
		return this.cakes.size();

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
