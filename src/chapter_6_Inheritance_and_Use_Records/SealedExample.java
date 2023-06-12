package chapter_6_Inheritance_and_Use_Records;

import java.math.BigDecimal;

import labs.pm.data.Rating;

public class SealedExample {

	public static void main(String[] args) {
		Product p1 = new CollectibleItem(130, "Big Ben design coffee mug", BigDecimal.valueOf(10.45), Rating.FOUR_STAR, "Big");
		System.out.println(p1.name() + " has a discount of " + p1.discount() + "%");
		Product p2 = new Drink(120, "Kefir", BigDecimal.valueOf(3.55), Rating.FIVE_STAR);
		System.out.println(p2.name() + " has a discount of " + p2.discount() + "%");
	}

}
