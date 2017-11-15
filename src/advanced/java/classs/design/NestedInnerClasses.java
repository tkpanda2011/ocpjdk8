package advanced.java.classs.design;

public class NestedInnerClasses {

	public static void main(String[] args) {
		NestedInnerClasses outerClass = new NestedInnerClasses();
		
		// ways to intantiate the Inner Class . 
		
		NestedInnerClasses.NestedClass innerClass = new NestedInnerClasses().new NestedClass();
		
		NestedInnerClasses.NestedClass innerClass2 = outerClass.new NestedClass();
	}
	
	public  class NestedClass {
		
		public String getInnerMethodData(BaseClass base) {
			base = new BaseClass();
			return base.toString();
		}
		
		/*
		 * 
		 * we cant have static methods in Non-static inner class or nested Classes. 
		 * Static methods are  created inside the static area , and nested objects are associated 
		 * with an object only having a static method inside another object is confusing , you are trying 
		 * to get a static reference from a inside a object  .  
		 * 
		public static void  getStaticValue() {
			
		}
		
		*/
	}
	
	
}
