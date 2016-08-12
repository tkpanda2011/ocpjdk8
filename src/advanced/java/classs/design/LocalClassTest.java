package advanced.java.classs.design;

public class LocalClassTest {

	public static void main(String[] args) {
		int i = 100;
		final class LocalClass {
			private String localMethod () {
				return "LOCAL VALUE FROM LOCAL CLASS"+i;
			}
			final class LocalInnerClass {
				private String localInnerClassMethod () {
					return "LOCAL Inner Class Value "+i;
				}
			}
		}
		
		LocalClass lc = new LocalClass();
		System.out.println(lc.localMethod());
		
		System.out.println(new LocalClass().new LocalInnerClass().localInnerClassMethod());
	}

}
/**
Local Inner Classes are local to a block only you can declare and intantiate the class inside the block only .
 */
