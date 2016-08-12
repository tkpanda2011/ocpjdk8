package lambda.built.in.functional.interfaces;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		
		int number = 10;
		modifyFlight("Multiply",number, value -> value *10);
		modifyFlight("Multiply",number, value -> value + 10);


	}
	
	
	public static void modifyFlight(String operation ,int value , Function<Integer,Integer> function) {
		int result = function.apply(value);
		System.out.println("Operation is "+operation+" The result is "+result);
	}
}
