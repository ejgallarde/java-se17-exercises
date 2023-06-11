package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 * {@code Shop} class represents an application that manages Products
 * 
 * @author ecgallar
 */
public class Shop {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("Local Time Now: " + now);
		System.out.println(now.isAfter(LocalTime.of(17, 30)) && now.isBefore(LocalTime.of(18, 30)));

		ProductManager pm = new ProductManager();
		Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STAR);
		System.out.println("P1 best before: " + p1.getBestBefore());
		Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
		Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR,
				LocalDate.now().plusDays(2));
		System.out.println("P3 best before: " + p3.getBestBefore());
		Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
		Product p5 = p3.applyRating(Rating.THREE_STAR);
		Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
		Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR,
				LocalDate.now().plusDays(2));
		Product p8 = p4.applyRating(Rating.FIVE_STAR);
		Product p9 = p1.applyRating(Rating.TWO_STAR);

		/*
		 * This is the old way of printing the values. We have overridden the toString
		 * method in Product class. System.out.println(p1.getId() + " " + p1.getName() +
		 * " " + p1.getPrice() + " " + p1.getDiscount() + " " +
		 * p1.getRating().getStars()); System.out.println(p2.getId() + " " +
		 * p2.getName() + " " + p2.getPrice() + " " + p2.getDiscount() + " " +
		 * p2.getRating().getStars()); System.out.println(p3.getId() + " " +
		 * p3.getName() + " " + p3.getPrice() + " " + p3.getDiscount() + " " +
		 * p3.getRating().getStars()); System.out.println(p4.getId() + " " +
		 * p4.getName() + " " + p4.getPrice() + " " + p4.getDiscount() + " " +
		 * p4.getRating().getStars()); System.out.println(p5.getId() + " " +
		 * p5.getName() + " " + p5.getPrice() + " " + p5.getDiscount() + " " +
		 * p5.getRating().getStars());
		 */
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println("P6 equals P7 =" + p6.equals(p7));
		System.out.println(p6);
		System.out.println(p7);
		System.out.println(p8);
		System.out.println(p9);

	}

}
