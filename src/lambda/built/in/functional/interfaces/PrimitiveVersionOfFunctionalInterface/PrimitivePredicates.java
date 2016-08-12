package lambda.built.in.functional.interfaces.PrimitiveVersionOfFunctionalInterface;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitivePredicates {

	public static void main(String[] args) {
		IntPredicate predicate = i -> i>10;
		
		 IntStream.range(1, 20).filter(predicate).forEach((s) -> System.out.println("Value is"+s));
		 
		 IntStream.range(1, 20).filter(predicate).forEach(System.out::println);
		 
		 DoublePredicate doublePredicate = du -> du > 10.5;
		 
		 LongPredicate longPredicate = longP -> longP >4899;
		 
		 LongStream.range(2000, 5000).filter(longPredicate).forEach(System.out::println);
		

	}

}
