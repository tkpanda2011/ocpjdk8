package advanced.java.io.fundamentals;

import java.io.Console;

public class ConsoleReader {

	public static void main(String[] args) {
		Console console = null;
		String s = null ;

//Consider the following code :
		Console c = System.console();
  String id = c.readLine("%s", "Enter UserId:"); //1
  System.out.println("userid is " + id); //2
  String pwd = new String(c.readPassword("%s", "Enter Password :")); //3
  System.out.println("password is " + pwd); //4

//Assuming that c is a valid reference to java.io.Console and that a user types jack as userid and jj123 as password, what will be the output on the console?
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
