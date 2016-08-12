package lambda.built.in.functional.interfaces.PrimitiveVersionOfFunctionalInterface;

import java.util.function.IntConsumer;

public class PrimitiveConsumers {

	public static void main(String[] args) {
		
		
		IntConsumer consumer = (x) -> System.out.println("Acccepted "+x);
		
		consumer.accept(100);
		 
		

	}

}
