package advanced.java.io.fundamentals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class PrinitWriter {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\jdk8\\testmywr.txt");
		
		java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter(file)));
		
		pw.write("writing content using PrintWrites \r\n Expecting a new Line");
		
		
		pw.close();
		
	}

}
