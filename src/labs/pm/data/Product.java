/**
 * 
 */
package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @author ecgallar
 *
 */
public sealed class Product implements Rateable<Product> permits Food, Drink {

	 Product(int id, String name, BigDecimal price, Rating rating) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}

//	public Product(int id, String name, BigDecimal price) {
//		this(id, name, price, Rating.NOT_RATED);
//	}
//
//	public Product() {
//		this(0, "No Name", BigDecimal.ZERO);
//	}

	private final int id;
	private final String name;
	private final BigDecimal price;
	private Rating rating;

	public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

	public BigDecimal getDiscount() {
		return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
	}

	public Product applyRating(Rating newRating) {
		return new Product(getId(), getName(), getPrice(), getRating());
	}

	public int getId() {
		return id;
	}

	public Rating getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", discount=" + getDiscount() + ", rating=" + rating.getStars();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Product p) {
//			Product other = (Product) obj; --- editing with Pattern Matching of Java 17
			return id == p.id && Objects.equals(name, p.name);
		}
		return false;
	}
	
	public LocalDate getBestBefore() {
		return LocalDate.now();
	}

}
