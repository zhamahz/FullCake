package demo;
import java.math.BigDecimal;
import java.util.HashSet;

import cakes.CakeType;
import cakes.SpecialCake;
import cakes.StandardCake;
import clients.Client;
import clients.Corporative;
import clients.PrivateClient;

public class Demo {
	
	public static void main(String[] args) {
		
		SweetShop shop = new SweetShop("Sweet Kiten- eat and smile!");
		
		for(int i = 0; i < 5; i++) {
			shop.addProvider(new Provider("Provider " + (i+1)));
		}
		
			shop.makeSpecialdCake(new SpecialCake("SweetCocko", new BigDecimal("60"), CakeType.SPECIAL));
			shop.makeSpecialdCake(new SpecialCake("SweetCherry", new BigDecimal("70"), CakeType.SPECIAL));
			shop.makeSpecialdCake(new SpecialCake("SweetCocko", new BigDecimal("60"), CakeType.SPECIAL));
			shop.makeStandardCake(new StandardCake("King", new BigDecimal("78"), CakeType.STANDARD));
		
		HashSet<Client> clients= new HashSet<>();
		
		for(int i = 0; i < 5; i++) {
			clients.add(new Corporative("corporative" + (i + 1)));
			clients.add(new PrivateClient("private" + (i + 1)));
		}	
		
		for(Client client : clients) {
			client.makeOrder(shop.getCakes(),"Mladost 4");
		}
	
	}

}
