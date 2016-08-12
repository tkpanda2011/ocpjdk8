package advanced.java.nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

	
public static void main(String[] args) throws IOException {
		
		Path filepath = Paths.get("D:\\jdk8\\.\\test1\\test2\\test3\\test.txt");
		Path filepath1 = Paths.get("D:\\jdk8\\..\\test2\\test3\\test.txt");
		Path filepath2 = Paths.get("D:\\jdk8\\test\\test.txt");
		
		System.out.println(filepath.getFileName());  //
		System.out.println(filepath.toAbsolutePath());
		System.out.println(filepath2.toAbsolutePath());
		System.out.println(filepath1.toAbsolutePath());
		System.out.println("after Normalize"+filepath1.normalize());
		System.out.println(filepath2.getNameCount()); // number of folders
		System.out.println(filepath2.getName(0));
		System.out.println("last element"+filepath2.getName(0));
		
		System.out.println("Parent dir are "+filepath.getParent());
		
		
		
	}
}
