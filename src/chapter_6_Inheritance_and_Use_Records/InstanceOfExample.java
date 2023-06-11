package chapter_6_Inheritance_and_Use_Records;

import java.math.BigDecimal;
import java.time.LocalDate;

import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

public class InstanceOfExample {
	public void printProduct(Product prod) {
		if(prod instanceof Drink drink) {
			System.out.println(drink.getName());
		} else if(prod instanceof Food food) {
			System.out.println(food.getName());
		}
	}
	
	public static void main(String[] args) {
		InstanceOfExample example = new InstanceOfExample();
		ProductManager pm = new ProductManager();
		Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STAR);
		Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR,
				LocalDate.now().plusDays(2));
		example.printProduct(p3);
		example.printProduct(p1);
		
		//Test the overridden equals method
		System.out.println(p1.equals(p3));
		p3 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STAR);
		System.out.println(p3.equals(p1));
	}
	
	
}
