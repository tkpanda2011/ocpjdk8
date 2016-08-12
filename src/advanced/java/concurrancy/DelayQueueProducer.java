package advanced.java.concurrancy;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class DelayQueueProducer {
	private BlockingQueue<Purchase> blockingQueue ;
	private final Random random = new Random();
	public DelayQueueProducer( BlockingQueue<Purchase> queue) {
		this.blockingQueue = queue;
	}
	
	private Thread producerThread = new Thread(new Runnable() {
		
		@Override
		public void run() {
			int i = 0;
			while(i++ < 10) {
				try{
					int delay = random.nextInt(70000);
					Purchase object = new Purchase(
						      UUID.randomUUID().toString(), delay);
							                    System.out.printf("Put object = %s%n", object);
							                    blockingQueue.put(object);
							                    Thread.sleep(500);

				} catch(Exception exp) {
					
				}
			}
			
		}
	}, "Producer Thread");
	
	public void start() {
		this.producerThread.start();
	}
}
