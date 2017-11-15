package exceptions.and.assertions;

import java.io.IOException;  
public class AutoCloseExample implements AutoCloseable{ 
	String header = null; 
	public void open(){ 
		header = "OPENED"; 
		System.out.println("Device Opened"); 
		} 
	public String read() throws IOException{ 
		throw new IOException("Unknown"); 
		}  
	
	public void writeHeader(String str) throws IOException{ 
		System.out.println("Writing : "+str); header = str;
		} 
	public void close(){
		header = null; System.out.println("Device closed"); 
		}  
	public static void testDevice(){
		try(AutoCloseExample d = new AutoCloseExample()){
			d.open(); 
			d.read();
			d.writeHeader("TEST"); 
			System.out.println("Calling Autoclose");
			d.close();
			
			}catch(IOException e){
				System.out.println("Got Exception"); 
				} 
		} 
	public static void main(String[] args) {
		AutoCloseExample.testDevice(); 
		}  
	
	
	public static void myMethod(int x) throws NoSuchFieldException//Specify throws clause here 
	{ try{ if(x == 0){
		throw new ArithmeticException(); 
		} else 
			throw new NoSuchFieldException(); 
	}catch(RuntimeException e){ throw e; } }
	}
