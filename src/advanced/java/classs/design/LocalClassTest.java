package advanced.java.classs.design;

public class LocalClassTest {
	public static String test ="testing ";
	public static void main(String[] args) {
		int i = 100;
		final class LocalClass {
			private String localMethod ( int  val) {
				val = 10;
				return "LOCAL VALUE FROM LOCAL CLASS"+i+test+"val ="+val;
			}
			final class LocalInnerClass {
				private String localInnerClassMethod ( BaseClass value) {
					value = new BaseClass();
					return "LOCAL Inner Class Value "+i;
				}
			}
		}
		
		LocalClass lc = new LocalClass();
		System.out.println(lc.localMethod(5));
		
		System.out.println(new LocalClass().new LocalInnerClass().localInnerClassMethod(new BaseClass()));
	}

}
/**
Local Inner Classes are local to a block only you can declare and intantiate the class inside the block only .
 */
