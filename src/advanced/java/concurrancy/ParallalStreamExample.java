package advanced.java.concurrancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallalStreamExample {

	public ParallalStreamExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> names =new ArrayList<String>();
		names.addAll( Arrays.asList(new String[]{"Tripati","Komal","rakesh","Srijith","ajeet","amar"}));
		IntStream.range(1, 50000 ).forEach(x -> names.add("count"+x));
		long start = System.currentTimeMillis();
		names.parallelStream().forEach(item -> item.toUpperCase());
		long end = System.currentTimeMillis();
		System.out.println("parallal   " + (end-start));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 start = System.currentTimeMillis();
		names.forEach(item -> item.toUpperCase());
		 end = System.currentTimeMillis();
		System.out.println("normal   " + (end-start));

	}

}
