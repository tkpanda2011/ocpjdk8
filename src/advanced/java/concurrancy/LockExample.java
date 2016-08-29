package advanced.java.concurrancy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

	public LockExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLock rlock = new ReentrantLock();	
	rlock.lock(); 
		rlock.lock();
		 
		ExecutorService es = Executors.newFixedThreadPool(2);
		
	}

}
