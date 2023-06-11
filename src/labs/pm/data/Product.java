/**
 * 
 */
package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

import chapter_5_Improved_Class_Design.enums.Workflow;

/**
 * @author ecgallar
 *
 */
public class Product {

	public Product(int id, String name, BigDecimal price, Rating rating) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}

	public Product(int id, String name, BigDecimal price) {
		this(id, name, price, Rating.NOT_RATED);
	}

	public Product() {
		this(0, "No Name", BigDecimal.ZERO);
	}

	private final int id;
	private final String name;
	private final BigDecimal price;
	private Rating rating;

	public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

	public BigDecimal getDiscount() {
		return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
	}

	public Product applyRating(Rating newRating) {
		return new Product(id, name, price, newRating);
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

	public void submitWorkflowExtract(String workflowName) {
		System.out.println("********************START " + workflowName + " EXTRACT********************");
		Workflow workflowSchedulerService = Workflow.getWorkflowByName(workflowName);
		System.out.println(workflowSchedulerService.getName());
		System.out.println(workflowSchedulerService.getWorkflowSchedulerService());
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
