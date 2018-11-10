package cakes;

import java.math.BigDecimal;

public class WeddingCake extends Cake {

	public WeddingCake(String name, BigDecimal price,CakeType type, int pieces) {
		super(name, price, type);
		this.setPieces(pieces);
	}

	@Override
	public int compareTo(Cake cake) {
		if(cake.getPieces() >= this.getPieces()) {
			return -1;
		} else {
			return 1;
		}
 	}

}
