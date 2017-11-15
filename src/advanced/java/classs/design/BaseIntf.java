package advanced.java.classs.design;

@FunctionalInterface
public interface BaseIntf {
	public void	printString();
	public String toString();
	public int hashCode();
	public boolean equals(Object obj);
	//public void finalize () throws Throwable;
	public  default void defaultMethod() {
		
	}
	
}
