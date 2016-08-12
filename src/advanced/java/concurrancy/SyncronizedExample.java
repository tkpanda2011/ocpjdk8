package advanced.java.concurrancy;

import java.lang.management.ManagementFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class SyncronizedExample {
	public int num = 10;
	public AtomicInteger num2 = new AtomicInteger(10); 
	public static void main(String[] args) throws InterruptedException {
		SyncronizedExample sync = new SyncronizedExample();
		Thread t1 = new Thread (sync.new Task21());
		Thread t2 = new Thread (sync.new Task22());
		t1.start();
		t2.start();
		
		Thread.sleep(500);
		 
		System.out.println("value of num now after sleep"+ sync.num);
		System.out.println("value of num2 now after sleep"+ sync.num2);
	}
	
	private synchronized String procesData() {
		num=num+10;
		
		synchronized (this) {
			num = num+10;
		}
		return null;
	}
	
	private  class Task21 implements  Runnable {
		public void run() {
			IntStream.range(1, 4).forEach(nbr -> {num*=nbr; System.out.println("task 21 "+nbr+" and num "+num);});
			IntStream.range(1, 4).peek(nbr -> System.out.println("task 21 "+nbr+" and num2 "+num2)).forEach(nbr -> num2.set(num2.get()*nbr));
			
		}
	}
	private  class Task22 implements Runnable {

		@Override
		public void run() {
			IntStream.range(1, 4).forEach(nbr -> {num-=nbr; System.out.println("task 22 number is"+nbr+" and num "+num);});
			IntStream.range(1, 4).forEach(nbr -> {num2.set(num2.get()-nbr);System.out.println("task 22 "+nbr+" and num2 "+num2);});
		
			
		}
		
	}
}
