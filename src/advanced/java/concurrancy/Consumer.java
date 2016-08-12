package advanced.java.concurrancy;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.stream.IntStream;

public class Consumer implements Runnable {
	BlockingQueue<Object> queue = null;
	Producer producer = null;
	public Consumer(BlockingQueue<Object> queue) {
		this.queue = queue;
	}
	
	public Consumer(BlockingQueue<Object> queue, Producer producer) {
		this.queue = queue;
		this.producer=producer; 
	}

	private Runnable priorityBlockingQueue = new Runnable() {
		
		@Override
		public void run() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("queue size is"+queue.size());
			IntStream.range(1, 10).forEach((x) -> System.out.println(""+getFromQueue(queue)));
			
		}

		private String getFromQueue(BlockingQueue<Object> queue) {
			String result = null;
			try {
				result = (String) queue.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("returning"+result);
			return result;
		}
	};
	private Runnable linkedTransferQeue = new Runnable() {
		
		public void run() {
			for(int i=0;i<5;i++){
				try {
					System.out.println("Consumer is waiting to take element...");
					String s= ((LinkedTransferQueue<Object>)queue).take().toString();
		     		        System.out.println("Consumer received Element: "+s);
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
					System.out.println("retrieved" +queue.take());
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
			}
	};
	
	@Override
	public void run() {
		// As long as there are empty positions in our array,
		// we want to check what's going on.
		int i = 0;
		while (queue.remainingCapacity() > 0) {
			if (++i%2 == 0 && i<8) {
				System.out.println("Picked Element "+queue.remove());
			}
			System.out.println("Queue size: " + queue.size() + ", remaining capacity: " + queue.remainingCapacity());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public BlockingQueue<Object> getQueue() {
		return queue;
	}

	public void setQueue(BlockingQueue<Object> queue) {
		this.queue = queue;
	}

	public Runnable getLinkedTransferQeue() {
		return linkedTransferQeue;
	}

	public void setLinkedTransferQeue(Runnable linkedTransferQeue) {
		this.linkedTransferQeue = linkedTransferQeue;
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
