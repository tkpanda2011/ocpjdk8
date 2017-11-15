package advanced.java.concurrancy;

import java.util.HashMap;

//Which statements regarding the following code are correct?

class A extends Thread
{
   public void run()
   {
      System.out.println("Starting loop");
      try{
           Thread.sleep(10000); //1  sleep for 10 secs
      }catch(Exception e){ e.printStackTrace(); }
      System.out.println("Ending loop");
   }
}
public class TestClass
{
      public static void main(String args[]) throws Exception
      {
    	
         A a = new A();
         a.start();
         Thread.sleep(1000);
         a.interrupt();
      }
}
