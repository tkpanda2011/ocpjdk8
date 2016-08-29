package advanced.java.io.fundamentals;

import java.io.Console;

public class ConsoleExample {

	public ConsoleExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();
		if (console != null) {
			console.printf(console.readLine());	
		} else {
			System.out.println("Console not found");
		}
		
	}

}
