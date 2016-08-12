package advanced.java.concurrancy;

import java.util.concurrent.BlockingQueue;

public class RemovingConsumer implements Runnable {
	Producer producer ;
	BlockingQueue<Object> queue ;
	public RemovingConsumer() {
		// TODO Auto-generated constructor stub
	}

	
	public RemovingConsumer(Producer producer, BlockingQueue<Object> queue) {
		super();
		this.producer = producer;
		this.queue = queue;
	}


	@Override
	public void run() {
		
		while (producer.isRunning) {
			
			try {
				System.out.println("Objects removed from  the queue"+queue.take());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Finally Elements in queue"+queue);
	}

}
