package advanced.java.classs.design;

public class EnumExample {
	
	public enum Colors {
		RED("RedColor"),
		GREEN("GreenColor"),
		YELLOW("YELLOWColor");
		// always Constatnt must be the first element if not present then there must be a ;
		
		private String myColor ;
		//if Constants values are defined at creating time their must be a constructor ;
		private Colors(String myColor) {
			this.myColor = myColor;
		}
		
		public String getString() {
			return myColor;
		}
		   
		}
	public enum Shapes {
		Circle,Squere;
		public String getString() {
			return Circle.getString();
		}
	}

	public static void main(String[] args) {
		EnumExample.Colors.GREEN.getString();
		System.out.println(EnumExample.Shapes.Squere.toString());
	}

}


 interface EnumIntf {
	public void getString();
}