package chapter_6_Inheritance_and_Use_Records;

import java.math.BigDecimal;

import labs.pm.data.Rating;

public non-sealed class CollectibleItem extends Souvenir {

	public CollectibleItem(int id, String name, BigDecimal price, Rating rating, String size) {
		super(id, name, price, rating, size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal discount() {
		return BigDecimal.valueOf(15);
	}

}
