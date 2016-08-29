package advanced.java.io.fundamentals;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public WriterExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try(Writer writer = new FileWriter("D:\\jdk8\\test\\test.txt", true);) {
			writer.write("After This will added to file".toCharArray(), 6, 15); // from the 6th index add 15 chars
			// it should print : This will added
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
