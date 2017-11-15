package advanced.java.classs.design;

public class InterFaceTest implements Measurement{
		public static void main( String[] args) {
			System.out.println("Calling the default method "+new InterFaceTest().getLength());
		}
		public void printData() {
			System.out.println("Calling the default method "+ InterFaceTest.this.getLength());
		}
}


interface Measurement{ 
	public default int getLength(){ 
		
		return 300; 
	} public static int getBreadth(){ return 0; } }  

interface Size extends Measurement{ 
	public static final int UNIT = 100; 
//	public static int getLength(){ return 10;} // default method an not be overridden or hidden by inheritence
	public static int getBreadth(){ return 0; }  // but static methods can be 
}