package lambda.built.in.functional.interfaces.PrimitiveVersionOfFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleSupplier;

public class StreamGetAsDouble {

	public static void main(String[] args) {

List<Book> books = Arrays.asList(
		new Book("Thinking in Java", 30.0), 
		new Book("Java in 24 hrs", 20.0), 
		new Book("Java Recipies", 10.0)
		); 

double averagePrice = books.stream().filter(b->b.getPrice()>90)
.mapToDouble(b-> b.getPrice()).average().orElse(1.0);
System.out.println(averagePrice);

	}

}


class Book{ 
	private String title; 
	private double price;
	private static boolean defaultValue;
	
	public static boolean getDefaultValue() {
		return defaultValue;
	}
	public static void setDefaultValue(Boolean defaultValue) {
		Book.defaultValue = defaultValue;
	}
	public Book(String title, double price){ 
		this.title = title; this.price = price; 
		} //getters/setters not shown
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}  //What will the following code print?  
