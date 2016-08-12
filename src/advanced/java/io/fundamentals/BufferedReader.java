package advanced.java.io.fundamentals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader {

	public static void main(String[] args) {
		
		String path = "D:\\jdk8\\test\\test.txt";
		try (java.io.BufferedReader br = new java.io.BufferedReader(new FileReader(path ));){
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
