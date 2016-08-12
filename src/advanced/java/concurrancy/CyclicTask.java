package advanced.java.concurrancy;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicTask implements Runnable {
	
	private CyclicBarrier cb ;
	public CyclicTask(CyclicBarrier cb) {
		this.cb =cb;
	}

	@Override
	public void run() {
		 System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
         try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         System.out.println(Thread.currentThread().getName() + " has crossed the barrier");

	}

}
