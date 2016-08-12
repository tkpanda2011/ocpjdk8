package advanced.java.concurrancy;

import java.util.stream.IntStream;

import advanced.java.util.Utility;

public class RunnableExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Task());
		thread.start();
		Thread firstName = new Thread(new RunnableExample().new FirstName());
		Thread lastName = new Thread(new RunnableExample().new LastName());
		firstName.start();
		lastName.start();
	}
	private class FirstName implements Runnable {

			@Override
			public void run() {
				Utility.getEmployeesList().stream().peek(s -> System.out.print("FirstName "+s.getFirstName())).forEach(s -> System.out.println(" "+s.getFirstName().toUpperCase()));
				
			}
			 
		 }
	private  class LastName implements Runnable {

			@Override
			public void run() {
				Utility.getEmployeesList().stream().forEach(s -> System.out.println("lastName "+s.getLastName().toUpperCase()));
				
			}
			 
		 }
}



 class Task implements Runnable {

	@Override
	public void run() {
		IntStream.range(1, 10).forEach(System.out::println);
		
	}
	
}

