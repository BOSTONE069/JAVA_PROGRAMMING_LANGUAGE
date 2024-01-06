package week_four;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private int id;
	private String name;
	private double price;
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public static long countProducts(List<Product> products) {
		  return products.stream()
				  .filter(product -> product.getPrice() < 30000)
				  .count();
	}
	
	

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		
		productsList.add(new Product(1, "HP Laptop", 25000));
		productsList.add(new Product(2, "Dell Laptop", 30000));
		productsList.add(new Product(3, "Lenevo Laptop", 28000));
		productsList.add(new Product(4, "Sony Laptop", 28000));
		productsList.add(new Product(5, "Apple Laptop", 90000));
		
		long count = countProducts(productsList);
		
		System.out.println("Number of products with price less than 30000: " + count);

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
