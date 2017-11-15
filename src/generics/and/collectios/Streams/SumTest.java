package generics.and.collectios.Streams;

import java.util.Arrays;
import java.util.List;

public class SumTest {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1, 2, 3);
		double sum = ls.stream().reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		 double sum2 = ls.stream().mapToDouble(x->x).sum();
		 System.out.println(sum2);
		 
		 double sum3 =9;
		// ls.stream().forEach(x -> {sum3= sum3+x;});//Local variable sum3 defined in an enclosing scope must be final or effectively final
	}

}
