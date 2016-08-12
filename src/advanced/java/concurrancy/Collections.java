package advanced.java.concurrancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

import advanced.java.util.Utility;
import generics.and.collectios.ComparableComparator.Employee;

public class Collections {

	public static void main(String[] args) throws InterruptedException {
		//arrayBlockingQueue();
		//delayQueue();
		//linkedBlockingQueue();
		//	linkedTransferQueue();
		//priorityBlockingQueue();
		//	synchronousQueue();
		//	blockingDeque();
		//	concurrantMap();
		//	concurrentNavigableMap();
	    //	cyclicBarrier();
		//copyOnWriteArrayList();

	}

	public static void delayQueue() throws InterruptedException {
		BlockingQueue<Purchase> queue = new DelayQueue<Purchase>();
		// Starting DelayQueue Producer to push some delayed objects to the queue
		new DelayQueueProducer(queue).start();
		// Starting DelayQueue Consumer to take the expired delayed objects from the queue

		Thread.sleep(1000);
		new DelayQueueConsumer("Consumer Thread-1", queue).start();

	}

	private static void copyOnWriteArrayList() {
		List<String> names =new CopyOnWriteArrayList<String>();
		names.addAll( Arrays.asList(new String[]{"Tripati","Komal","rakesh","Srijith","ajeet","amar"}));
		
		Iterator<String> it = names.iterator();
		int i =0;
		while (it.hasNext()) {
			
			if ("Tripati".equalsIgnoreCase(it.next())) {
				names.remove(i);
				System.out.println("removed");
			}
			i++;
		}
			System.out.println("remaining "+names);
	}

	public static void concurrentNavigableMap() {

		ConcurrentNavigableMap< String, List<Employee>> deptEmpsMap = new ConcurrentSkipListMap<>();
		Utility.getDepartments().forEach( dept -> deptEmpsMap.putIfAbsent(dept.getDepartmentName(), dept.getEmployees()));

		System.out.println(deptEmpsMap.tailMap("HR", false));	 // returns a subset comparing the key

	}
	/**
	 *  The CyclicBarrier class is a synchronization mechanism that allows a set of threads to all wait for each other to reach a common barrier point. The barrier is called cyclic because it can be re-used after the waiting threads are released.
		The waiting threads wait at the CyclicBarrier until either:
		The last thread arrives (calls await())
		The thread is interrupted by another thread (another thread calls its interrupt() method)
		Another waiting thread is interrupted
		Another waiting thread times out while waiting at the CyclicBarrier
		The CyclicBarrier.reset() method is called by some external thread.
		When you create a CyclicBarrier you specify how many threads wait for it, before releasing them:
	 */
	public static void cyclicBarrier() {
		final CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {

			@Override
			public void run() {
				//This task will be executed once all thread reaches barrier
				System.out.println("All parties are arrived at barrier, lets play");

			}
		});

		Thread t1 = new Thread(new CyclicTask(cb) , "Thread1");
		Thread t2 = new Thread(new CyclicTask(cb), "Thread2");
		Thread t3 = new Thread(new CyclicTask(cb), "Thread3");

		t1.start();
		t2.start();
		t3.start();
	}

	private static void concurrantMap() {
		ConcurrentMap< String, List<Employee>> deptEmpsMap = new ConcurrentHashMap<>();
		Utility.getDepartments().forEach( dept -> deptEmpsMap.putIfAbsent(dept.getDepartmentName(), dept.getEmployees()));
		List<Employee> emps = deptEmpsMap.getOrDefault("HR", new ArrayList<>());

		deptEmpsMap.forEach((key,value ) -> System.out.println("Key is "+key + "and Employees are"+value));

		deptEmpsMap.compute("HR", (key,value) -> value.subList(0, 2));

		System.out.println(deptEmpsMap.get("HR"));


	}

	private static void blockingDeque() {
		// TODO Auto-generated method stub

	}

	private static void priorityBlockingQueue() {
		BlockingQueue<Object> queue = new PriorityBlockingQueue<>();
		Producer producer = new Producer( queue);
		System.out.println("Starting producer");
		new Thread(producer.getPriorityBlockingQueue()).start();
		System.out.println("Starting consumer");
		new Thread(new Consumer(queue).getPriorityBlockingQueue()).start();
	}

	private static void synchronousQueue() {
		BlockingQueue<Object>  queue = new SynchronousQueue<>();
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue, producer);
		new Thread(producer.getSyncronousQueue()).start();
		new Thread(consumer.getSyncronousQueue()).start();;

	}

	private static void linkedBlockingQueue() {
		BlockingQueue<Object> linkedQueue = new LinkedBlockingQueue<>(10);
		Producer producer = new Producer(linkedQueue);
		ObservingConsumer obc = new ObservingConsumer(producer, linkedQueue);
		RemovingConsumer remCon = new RemovingConsumer(producer, linkedQueue);

		Thread producerThread = new Thread(producer);
		Thread obThread = new Thread(obc);
		Thread remThread = new Thread(remCon);

		producerThread.start();
		obThread.start();
		remThread.start();
	}

	private static void linkedTransferQueue() {
		BlockingQueue<Object> queue = new LinkedTransferQueue<>();
		ExecutorService executor = Executors.newFixedThreadPool(2);

		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		executor.execute(producer.getTransferQueue());
		executor.execute(consumer.getLinkedTransferQeue());
		executor.shutdown();

	}

	private static void arrayBlockingQueue() {

		// Let's create a blocking queue that can hold at most 5 elements.
		BlockingQueue queue = new ArrayBlockingQueue<>(5);
		// The two threads will access the same queue, in order
		// to test its blocking capabilities.
		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));
		producer.start();
		consumer.start();

	}

}
