package advanced.java.io.fundamentals;

import java.io.File;
import java.io.IOException;

public class FileWriter {

	public static void main(String[] args) throws IOException {
		File file = new File("d:\\test\\test5.txt");
		if ( !file.exists()) {
		//	file.mkdirs();
			file.createNewFile();
		}
		java.io.FileWriter fw= new java.io.FileWriter(file);
		fw.write("heoolodfdfdsfdsfsdfdsf\\ncheck my mail ");
		fw.close();
	}

}
