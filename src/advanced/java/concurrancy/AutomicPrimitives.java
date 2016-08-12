package advanced.java.concurrancy;

import java.util.concurrent.atomic.AtomicInteger;

public class AutomicPrimitives {
	public AtomicInteger inte =new AtomicInteger(10);
	
	public void processData () {
		
		int oldValue = inte.get();
		inte.set(15);
	System.out.println(inte.compareAndSet(oldValue, 20));
	int val = inte.accumulateAndGet(5, (a,b) -> a*b);
	System.out.println(val);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new AutomicPrimitives ().processData();
	}

}
