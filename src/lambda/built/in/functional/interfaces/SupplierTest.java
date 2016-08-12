package lambda.built.in.functional.interfaces;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String args[]) {
		
		Supplier<SupplierTest> supplier = SupplierTest::new;
		SupplierTest supplierObj = supplier.get();
		supplierObj.normalMethod();
		
		supplierObj.display(() -> 5);
		
		
		
	}
	public  void display(Supplier data) {
		System.out.println("Supplyed value is "+data.get());
	}
	
	public  void normalMethod() {
		System.out.println("Normal Method invoked ");
	}
}
