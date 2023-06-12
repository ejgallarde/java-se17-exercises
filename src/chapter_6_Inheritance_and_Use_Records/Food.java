package chapter_6_Inheritance_and_Use_Records;

import java.math.BigDecimal;
import java.time.LocalDate;

import labs.pm.data.Rating;

public record Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) implements Product {
	public BigDecimal discount() {
		return BigDecimal.TEN;
	}
}
