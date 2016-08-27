package advanced.java.io.fundamentals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) {
		Reader rd = null;
		String path = "D:\\jdk8\\test\\test.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path ));){
			String data = null;
			while ((data = br.readLine() ) != null) {
			
				System.out.println(data);
			}
			
					} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
