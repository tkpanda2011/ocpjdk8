package advanced.java.io.fundamentals;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		File file = new File("D:\\jdk8\\test\\test.txt");
		System.out.println(file.canExecute());
		System.out.println(file.isDirectory());
		if(!file.exists()) {
			try {
			//	file.mkdirs(); // creates directory 
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getUsableSpace());
		
	}

}
