

package advanced.java.concurrancy;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import advanced.java.util.Utility;
import generics.and.collectios.ComparableComparator.Employee;

public class CallableExample {

	public static void main(String[] args) {
		//ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<List<String>> firstNameFuture = executor.submit(new CallableExample().new FirstName());
		Future<List<String>> lastName = executor.submit(new CallableExample().new LastName());
		Future<List<String>> firstNameFuture2 = executor.submit(new CallableExample().new FirstName());
		Future<List<String>> lastName2 = executor.submit(new CallableExample().new LastName());
		executor.submit( () -> {System.out.println("Its  running");
		
		});
			try {
				System.out.println("Future names "+firstNameFuture.get());
				System.out.println("Future Last Names"+lastName.get());
				System.out.println("Future names 2"+firstNameFuture2.get());
				System.out.println("Future Last Names 2"+lastName2.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				executor.shutdown();
				executor.shutdownNow();
				executor.shutdownNow();
			}
	
		
	}
	
	private class FirstName implements Callable<List<String>> {

		@Override
		public List<String> call() {
			List<String> names =Utility.getEmployeesList().stream().map(e -> e.getFirstName()).collect(Collectors.toList());
			
			return names;
		}
		 
	 }
private  class LastName implements Callable<List<String>> {

		@Override
		public  List<String> call() {
			 return Utility.getEmployeesList().stream().map( emp -> emp.getLastName()).collect(Collectors.toList());
		}
		 
	 }

}

	
