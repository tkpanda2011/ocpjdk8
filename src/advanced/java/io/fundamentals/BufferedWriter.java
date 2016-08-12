package advanced.java.io.fundamentals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter {

	public static void main(String[] args) {
		File file = new File("d:\\jdk8\\testwrite.txt");
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			java.io.BufferedWriter writter = new java.io.BufferedWriter(new FileWriter(file));
			writter.write("writing dmmy content \r\n its a new line ");
			writter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	
	}

}
