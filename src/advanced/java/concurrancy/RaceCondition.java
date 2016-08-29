package advanced.java.concurrancy;

public class RaceCondition {
	public static int Counter = 0;
	public RaceCondition() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		USerCounter c = new USerCounter();
		Thread t1 = new Thread(new USerCounter(),"Thread t1");
		Thread t2 = new Thread(new USerCounter(),"Thread t2");
		Thread t3 = new Thread(new USerCounter(),"Thread t3");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
class USerCounter implements Runnable {
	
	@Override
	public void run() {
	increment();
	increment();
	increment();
	}
	public void increment() {

		//RaceCondition.Counter++;
		System.out.println(RaceCondition.Counter++ +" is the value set by"+Thread.currentThread().getName());
		
	
	}
}
