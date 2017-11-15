package generics.and.collectios.Streams;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParalalExample {

	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger(); 
		List<String> stream2 = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul").collect(Collectors.toList()); 
		
		stream2.stream().filter( e-> e.contains("o")).forEach(System.out::println);
		// .filter( e-> e.contains("o")) is the intermediate operation 
		// forEach needs to be executed for all the elsment
		System.out.println("============================");
		Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul"); 
		stream.filter( e->{ ai.incrementAndGet(); 
		return e.contains("o"); }).peek(System.out::println).allMatch(x->x.indexOf("o")>0);  
		
		//stream.filter( e->{ ai.incrementAndGet(); 
		//return e.contains("o"); }).peek(System.out::println)
		
		//above intermediate operation will execute once only as the terminal operation fails for the first elment itself 
		// and ai will be incremented only once 
		AtomicInteger ai2 = new AtomicInteger(); 
		Stream<String> stream3 = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul").parallel(); 
		stream3.filter( e->{ ai2.incrementAndGet(); 
		return e.contains("o"); }).peek(System.out::println).allMatch(x->x.indexOf("o")>0);  
		
		//stream.filter( e->{ ai.incrementAndGet(); 
		//return e.contains("o"); }).peek(System.out::println)
		
		//above intermediate operation will execute once only as the terminal operation fails for the first elment itself 
		// value of ai depends on number of threads created 
		
		System.out.println("AI = "+ai+  "  AI2 = "+ai2);
	}

}
