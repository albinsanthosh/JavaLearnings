package newFeatures.java8.stream;

import java.util.ArrayList;
import java.util.List;

class Product3 {
	int id;
	String name;
	float price;

	public Product3(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamExampleReduce {
	public static void main(String[] args) {
		List<Product3> productsList = new ArrayList<Product3>();
		// Adding Products
		productsList.add(new Product3(1, "HP Laptop", 25000f));
		productsList.add(new Product3(2, "Dell Laptop", 30000f));
		productsList.add(new Product3(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product3(4, "Sony Laptop", 28000f));
		productsList.add(new Product3(5, "Apple Laptop", 90000f));
		
		// This is more compact approach for filtering data
		Float totalPrice = productsList.stream().map(product -> product.price).reduce(0.0f,
				(sum, price) -> sum + price); // accumulating price
		System.out.println(totalPrice);
		
		// More precise code
		float totalPrice2 = productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum); // accumulating
																											// price, by
																											// referring
																											// method of
																											// Float
																											// class
		System.out.println(totalPrice2);

	}
}
