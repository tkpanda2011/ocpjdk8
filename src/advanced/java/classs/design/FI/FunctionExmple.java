package advanced.java.classs.design.FI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExmple {

	public FunctionExmple() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		 List<Integer> ls = Arrays.asList(1, 2, 3); 
		 Function<Integer, Integer> func = a->a*a; //1 
		 ls.stream().map(func).peek(System.out::print).forEach(x -> System.out.println(x));; //2

	}

}
