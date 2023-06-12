package chapter_6_Inheritance_and_Use_Records;

import java.math.BigDecimal;
import java.time.LocalDate;

import labs.pm.data.Rating;

public class RecordExample {

	public static void main(String[] args) {
		Drink d1 = new Drink(120, "Kefir", BigDecimal.valueOf(3.55), Rating.FIVE_STAR);
		Drink d2 = new Drink(120, "Kefir", BigDecimal.valueOf(3.55), Rating.FIVE_STAR);
		
		System.out.println("Drink 1: " + d1);
		System.out.println("Drink 2: " + d2);
		System.out.println("Is drink 1 equal to drink 2? " + d1.equals(d2));
		System.out.println("Is drink 1 the same object as drink 2? " + (d1==d2));
		Food f = new Food(121, "Bagel", BigDecimal.valueOf(4.87), Rating.FOUR_STAR, LocalDate.now());
		System.out.println(f);
		System.out.println(f.name() + ": has a discount of " + f.discount() + "%");
	}

}
