package chapter_6_Inheritance_and_Use_Records;

import java.math.BigDecimal;

public sealed interface Product permits Drink, Food, Souvenir {
	String name();
	BigDecimal discount();
}
