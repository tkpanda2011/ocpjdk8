package advanced.java.classs.design;

import generics.and.collectios.ComparableComparator.Employee;

public class EnumExample {
	
	public enum Colors implements BaseIntf{
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

		@Override
		public void printString() {
			System.out.println("value of "+this.name()+" is "+myColor);
			
		}
		   
		}
	
	public enum Employees {
		
		RAM(new Employee(100,20,"M","RAM","SINGH")),
		SHYAM(new Employee(100,20,"M","HARI","SINGH")),
		HARI(new Employee(100,20,"M","HARI","SINGH"));
		private Employee emp;
		private Employees(Employee myColor) {
			this.emp = myColor;
		}
		
		public Employee getEmployee () {
			return emp;
		}
	}
	public  enum Shapes {
		Circle,Squere;
		public String getString() {
			return Circle.getString();
		}
	}

	public static void main(String[] args) {
		System.out.println(EnumExample.Colors.GREEN.getString());
		
		System.out.println(EnumExample.Shapes.Squere.toString());
	}

}


 interface EnumIntf {
	public void getString();
}