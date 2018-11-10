package cakes;

import java.math.BigDecimal;

public class StandardCake extends Cake {

	public StandardCake(String name, BigDecimal price, CakeType type) {
		super(name, price,type);
	}

	@Override
	public int compareTo(Cake cake) {
		return cake.getPrice().compareTo(this.getPrice());
 	}

}
