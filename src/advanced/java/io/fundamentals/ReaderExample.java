package advanced.java.io.fundamentals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public ReaderExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try(Reader reader = new java.io.FileReader(new File("D:\\jdk8\\test\\test.txt"));) {
			int ch =' ';
			while (( ch = reader.read()) != -1) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
