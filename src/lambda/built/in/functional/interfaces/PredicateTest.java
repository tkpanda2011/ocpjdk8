package lambda.built.in.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<String> nullCheck = arg -> args != null;
		 Predicate<String> emptyCheck = arg -> arg.length() > 0;
		 Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
		 String helloStr = "hello";
		 
		 
		 System.out.println(nullAndEmptyCheck.test(helloStr));
		 String nullStr = null;
		// System.out.println(nullAndEmptyCheck.test(nullStr));
		 
		 
		 List<String> greeting = new ArrayList<>();
		 greeting.add("hello");
		 greeting.add("world");
		 
		 greeting.removeIf(((Predicate<String>)str -> str.startsWith("he")).negate());
	
		 
				 
				 // removeIf we can use instead of below approch 
		 
		 
		 System.out.println(greeting);
		 greeting.add("This");
		 greeting.add("is");
		 
		 greeting.add("not");
		 greeting.add("going");
		 
		 greeting.add("to");
		 greeting.add("end");
		 greeting.add("here");
		 greeting.add("continue");
		 
		 Consumer<List<String>> printUpperCase = elem -> elem.forEach(System.out :: println);
		 
		 printUpperCase.accept(greeting);
		 
		 for (String str : greeting ) {
			 if (str.equals("to")) {
				 greeting.remove(str);
			 }
		 }
		 System.out.println(greeting);

}}