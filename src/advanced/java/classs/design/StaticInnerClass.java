package advanced.java.classs.design;

public class StaticInnerClass {

	public static void main(String[] args) {
		StaticInnerClass.InnerClass innerClass2 = new InnerClass();
	//	System.out.println(""+innerClass.getNonStaticInnerMethod());
		System.out.println(""+new InnerClass().getNonStaticInnerMethod());
		System.out.println( InnerClass.getStaticInnerMethod());
		
		
	}

	public  static  class InnerClass extends BaseClass{
		private String staticMember = "StaticInnerClassStaticMember";
		public  String getNonStaticInnerMethod() {
			
			return "FROM INNER";
		}
		
		public  static String getStaticInnerMethod() {
			
			return "FROM INNER";
		}
	}
	
	public  void callInnerClassMethod() {
		System.out.println( StaticInnerClass.InnerClass.getStaticInnerMethod());
		
	}
}
