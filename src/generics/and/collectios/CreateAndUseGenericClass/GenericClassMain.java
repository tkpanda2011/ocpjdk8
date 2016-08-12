package generics.and.collectios.CreateAndUseGenericClass;

public class GenericClassMain {

	public static void main(String[] args) {
		GenericClass<String,?> gc = new GenericClass<>("Only String");
		System.out.println(gc.getObj2());
		
		GenericClass<String,Integer> gc2 = new GenericClass<>("Only String2  ",2000);
		System.out.println(gc2.getObj()+gc2.getObj2());
		
	}

}
