package advanced.java.concurrancy;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.stream.IntStream;

public class Producer implements Runnable {
	
	private BlockingQueue<Object> queue =null;
	public boolean isRunning = true;
	

	public Producer(BlockingQueue<Object> queue) {
		this.queue = queue;
	}
	
	private Runnable priorityBlockingQueue = new Runnable() {
		
		@Override
		public void run() {
				IntStream.range(1, 10).forEach((i)->{
					System.out.println("Adding Now "+"String"+(10-i));
					queue.add("String"+(10-i)); });
			
		}
	};
	
	private Runnable transferQueue = new Runnable() {
		
		@Override
		public void run() {
			for( int i=0; i<5 ; i++ ) {
				try {
					System.out.println("Producer is waiting to transfer...");
					((LinkedTransferQueue<Object>)queue).transfer((Object)("A"+i));
					System.out.println("producer transfered element: A"+i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Runnable syncronousQueue = new Runnable() {
		
		@Override
		public void run() {
			IntStream.range(1, 10).forEach((num) -> {
				try {
					System.out.println("Adding num "+num+"status = "+queue.offer("String"+num));
					Thread.sleep(50);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
			isRunning = false;
		}
	};
	
	@Override
	public void run() {

		// We are adding elements using offer() in order to check if
		// it actually managed to insert them.
		for (int i = 0; i < 8; i++) {
			System.out.println("Trying to add to queue: String " + i +
					" and the result was " + queue.offer("String " + i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.isRunning = false;
	}

	public BlockingQueue<Object> getQueue() {
		return queue;
	}

	public void setQueue(BlockingQueue<Object> queue) {
		this.queue = queue;
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public Runnable getTransferQueue() {
		return transferQueue;
	}

	public void setTransferQueue(Runnable transferQueue) {
		this.transferQueue = transferQueue;
	}

	public Runnable getPriorityBlockingQueue() {
		return priorityBlockingQueue;
	}

	public void setPriorityBlockingQueue(Runnable priorityBlockingQueue) {
		this.priorityBlockingQueue = priorityBlockingQueue;
	}

	public Runnable getSyncronousQueue() {
		return syncronousQueue;
	}

	public void setSyncronousQueue(Runnable syncronousQueue) {
		this.syncronousQueue = syncronousQueue;
	}

	
	
	
}
