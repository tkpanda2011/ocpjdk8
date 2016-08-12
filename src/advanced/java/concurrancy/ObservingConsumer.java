package advanced.java.concurrancy;

import java.util.concurrent.BlockingQueue;

public class ObservingConsumer implements Runnable {
	Producer producer ;
	BlockingQueue<Object> queue ;
	public ObservingConsumer() {
		// TODO Auto-generated constructor stub
	}

	
	public ObservingConsumer(Producer producer, BlockingQueue<Object> queue) {
		super();
		this.producer = producer;
		this.queue = queue;
	}


	@Override
	public void run() {
		
		while (producer.isRunning) {
			System.out.println("Objects in the queue"+queue);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Finally Elements in queue"+queue);
	}

}
