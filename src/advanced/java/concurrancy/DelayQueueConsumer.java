package advanced.java.concurrancy;

import java.util.concurrent.BlockingQueue;

public class DelayQueueConsumer {
	private String name ;
	private BlockingQueue<Purchase> queue;
	
	public DelayQueueConsumer() {
		// TODO Auto-generated constructor stub
	}

	public DelayQueueConsumer(String name, BlockingQueue<Purchase> queue) {
		super();
		this.name = name;
		this.queue = queue;
	}
	
	private Thread consumerThread = new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println(""+queue.size());
			while (!queue.isEmpty() ) {
				try {
					Purchase purchase = (Purchase) queue.take();
					System.out.printf("[%s] - Take object = %s%n",
						       Thread.currentThread().getName(), purchase);
						       Thread.sleep(1000);
						 } catch (InterruptedException e) {
						e.printStackTrace();
						}
				
				
			}
			
		}
	});

	public void start(){
		        this.consumerThread.setName(name);
		        this.consumerThread.start();
		    }

}
