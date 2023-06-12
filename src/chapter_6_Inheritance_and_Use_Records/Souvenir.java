package chapter_6_Inheritance_and_Use_Records;

import java.math.BigDecimal;

import labs.pm.data.Rating;

public sealed class Souvenir implements Product permits CollectibleItem {

	public Souvenir(int id, String name, BigDecimal price, Rating rating, String size) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.size = size;
	}

	private int id;
	private String name;
	private BigDecimal price;
	private Rating rating;
	private String size;

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public BigDecimal discount() {
		return null;
	}

}
