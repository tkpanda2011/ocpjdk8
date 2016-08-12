package advanced.java.io.fundamentals;

import java.io.Console;

public class ConsoleReader {

	public static void main(String[] args) {
		Console console = null;
		String s = null ;
		
		try
		{
		   console = System.console();
		   System.out.println("Ready to take input"+console); 
		   if (console != null)
		   {
			   System.out.println("Ready to take input");
		      s = console.readLine();
		      System.out.println(s);
		   }
		} catch (Exception ex)
		{
		   ex.printStackTrace();
		}

	}

}
