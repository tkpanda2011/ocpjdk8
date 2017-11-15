package generics.and.collectios.Streams;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Double> dList = Arrays.asList(10.0, 12.0); 
		dList.stream().forEach(x->{ x = x+10; });
		dList.stream().forEach(d->System.out.println(d));

	}

}
