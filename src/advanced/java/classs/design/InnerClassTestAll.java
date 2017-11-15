package advanced.java.classs.design;

public class InnerClassTestAll {

	public static void main(String[] args) {
		//call stati inner class methods 
		System.out.println( StaticInnerClass.InnerClass.getStaticInnerMethod());
		
		//  call non satic method of satic innern class 
		
		StaticInnerClass.InnerClass inner = new StaticInnerClass.InnerClass();
		
		System.out.println(inner.getNonStaticInnerMethod());
	}

}
