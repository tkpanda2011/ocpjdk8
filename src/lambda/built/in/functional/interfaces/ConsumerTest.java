package lambda.built.in.functional.interfaces;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<String> consumer = ConsumerTest::printContent;
		consumer.accept("String");
		consumer.accept("Integer");
		consumer.accept("Double");
		
		Consumer<ConsumerTest> consumer2 = (u) -> System.out.println("Consummer name is "+u.getUsername());
		
		/*
		 * instance of ConsumerTest passed to acept and Syso called for the instance .
		 */
		consumer2.accept(new ConsumerTest() );
	}
	private static void printContent(String content) {
		System.out.println("Content invoked "+content);
	}
	
	private String getUsername() {
		 return "Tripati";
	}

}
