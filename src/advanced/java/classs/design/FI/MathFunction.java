package advanced.java.classs.design.FI;


@FunctionalInterface
public interface MathFunction {
	public int operation(int a , int b);
	
	default public  int getDefaultInt () {
		return 300;
	}
	default public  int getDefaultMultiple () {
		return 30;
	}
	default public  int getDefaultDivide () {
		return 3000;
	}
	}
