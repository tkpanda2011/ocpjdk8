package advanced.java.concurrancy;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class RecursiveSumOfN extends RecursiveTask<Long> {
		private static Long valueOfN;
		private static int MAX_THREAD ;
		private long to;
		private long from;
	 
	public RecursiveSumOfN() {
		// TODO Auto-generated constructor stub
	}

	public RecursiveSumOfN(long from, long to) {
		this.from= from;
		this.to = to;
	}
	
	// the method performs fork and join to compute the sum if the range
	// of values can be summed by a threadremember that we want to divide
	// the summation task equally among NUM_THREADS) then, sum the range
	// of numbers from..to using a simple for loop;
	// otherwise, fork the range and join the results
	@Override
	protected Long compute() {
		printData("Got the call for the range "+from+" and "+to);
			if ( (to - from ) < (valueOfN/MAX_THREAD)) {
				
			//	long localsum = 0 ; 
				long localsum = LongStream.range(from, to+1).reduce((x,y) -> (x + y)).getAsLong();
				System.out.printf("\tSum of value range %d to %d is %d %n",
						from, to, localsum);
						
				return localsum;
			} else {
				long mid = ( to + from ) / 2;
				RecursiveSumOfN firstHalf = new RecursiveSumOfN(from, mid) ;
				printData("Forking Computation into 2 ranges from = "+from +" and "+mid);
				firstHalf.fork();
				RecursiveSumOfN secondHalf = new RecursiveSumOfN(mid+1 ,to) ;
				printData("Computation ranges from = "+(mid+1) +" and "+to);
				long resultSecond = secondHalf.compute();
				
				return firstHalf.join() + resultSecond;
			}
		
	}

	public static void main(String[] args) {
		valueOfN = 1_00L;
		MAX_THREAD = Runtime.getRuntime().availableProcessors();
		ForkJoinPool pool = new ForkJoinPool();
		long startTime = System.currentTimeMillis();
		long computedSum = pool.invoke(new RecursiveSumOfN(0,valueOfN));
		long endTime = System.currentTimeMillis();
		System.out.println("Result= "+computedSum+" in time "+(endTime - startTime));
		startTime = System.currentTimeMillis();
		
		long formulaSum = (valueOfN * (valueOfN + 1)) / 2;
		
		endTime = System.currentTimeMillis();
		System.out.println(" normal Result= "+formulaSum+" in time "+(endTime - startTime));
	}
	
	public static synchronized void printData( String input) {
		System.out.println(input);
	}
}
