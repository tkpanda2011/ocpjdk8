package generics.and.collectios.Streams;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class OptionalExample {

	public static void main(String[] args) {
		Optional<Integer> v1 = IntStream.rangeClosed(10, 15) .peek((x2)->System.out.print("+"+x2)) .boxed().filter(x->x>12) .parallel() .findAny();  
		System.out.println("");
		Optional<Integer> v2 = IntStream.rangeClosed(10, 15) .peek((x2)->System.out.print("+"+x2)) .boxed() .filter(x->x>12) .sequential() .findAny();
		System.out.println("");
		Optional<Integer> v4 = IntStream.range(10, 15) .peek((x2)->System.out.print("+"+x2)) .boxed() .filter(x->x>12) .sequential() .findAny();
		System.out.println("");
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println(Optional.ofNullable(getVale()).orElse(200));
		Supplier<Integer> supplier = ()-> {return 100;};
	Integer inte =	Optional.ofNullable(getVale()).orElseGet(OptionalExample::getDefaultVale);
	
	System.out.println(inte);
	
	}

	private static Integer getVale() {
		// TODO Auto-generated method stub
		return null;
	}
	private static Integer getDefaultVale() {
		// TODO Auto-generated method stub
		return new Integer(500);
	}

}
