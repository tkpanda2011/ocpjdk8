package advanced.java.classs.design.FI;

public class MathFunctionImpl {

	public static void main(String[] args) {
		// multiple line impl
			MathFunction mfAdd = (a,b) -> {
				int result =  a+b;
				System.out.println("Returnig the addition "+result);
				return result;
			};	
			
			MathFunction mfSub = (a,b) -> {
				int result =  a-b;
				System.out.println("Returnig the addition "+result);
				return result;
			};	
			
			// single line implementation 
			MathFunction mfMul = (a,b) -> a*b;
			
			System.out.println("addition "+mfAdd.operation(10, 20));
			System.out.println("Substraction "+mfSub.operation(30, 10));
			System.out.println("Multiplication "+mfMul.operation(10, 20));
	}

}
