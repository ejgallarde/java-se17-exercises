package chapter_6_Inheritance_and_Use_Records;

import java.math.BigDecimal;

import labs.pm.data.Rating;

public record Drink(int id, String name, BigDecimal price, Rating rating) implements Product {

	@Override
	public BigDecimal discount() {
		return BigDecimal.valueOf(5);
	}

}
