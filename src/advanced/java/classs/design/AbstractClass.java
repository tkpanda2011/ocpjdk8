package advanced.java.classs.design;

public abstract class AbstractClass extends BaseClass {
		public static String filed1 = "";
		private final String string;// ="hello";
		
		public AbstractClass() {
			filed1 ="";
			string ="";
		}
		
		public AbstractClass(String filed1) {
			filed1 ="";
			//string ="";  // all constructors must intialize the finalfield 
		}
}
