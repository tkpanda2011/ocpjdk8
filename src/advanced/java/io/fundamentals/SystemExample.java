package advanced.java.io.fundamentals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SystemExample {

	public SystemExample() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String[] args) {
		try {
			int num = System.in.read();
			System.out.println(num + " is the ascii value of "+new Character((char) num));
			// set a file as defult input stream
			System.setIn(new FileInputStream(new File("D:\\jdk8\\test\\test.txt")));
			
			//read few bytes
			
			while ( (num = System.in.read()) != -1) {
				System.out.print(new Character((char) num));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
