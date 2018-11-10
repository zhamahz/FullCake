package cakes;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Cake implements Comparable<Cake> {
	
	private String name;
	private String description;
	private int price;
	private CakeType type;
	private CakeForm form;
	private int pieces;

	
	public Cake(String name, BigDecimal price, CakeType type) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.setForm();
	}
	
	private void setForm() {
		int r = new Random().nextInt(3);
		switch (r) {
		case 0:
			this.form = CakeForm.BISCUIT;
			break;
		case 1:
			this.form = CakeForm.CHOC;
			break;
		case 2:
			this.form = CakeForm.ECLER;
			break;
		case 3:
			this.form = CakeForm.FROOD;
			break;
		}
	}

	public CakeForm getForm() {
		return form;
	}

	
	public abstract int compareTo(Cake cake);
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public CakeType getType() {
		return type;
	}

	public void setType(CakeType type) {
		this.type = type;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public void setForm(CakeForm form) {
		this.form = form;
	}
	
	@Override
	public boolean equals(Object cake) {
		if (cake == null) {
	        return false;
	    }
	    if (!Cake.class.isAssignableFrom(cake.getClass())) {
	        return false;
	    }
	    
	    final Cake other = (Cake) cake;
	    
	    if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
	        return false;
	    }
	    return true;
		
	}
	
	@Override
	public int hashCode() {
	    int hash = 3;
	    hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
	    return hash;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
