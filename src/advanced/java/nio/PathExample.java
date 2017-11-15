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
		
		System.out.println(" filepath.getFileName() "+filepath.getFileName());  //
		
		System.out.println(" filepath.toAbsolutePath() "+filepath.toAbsolutePath());
		System.out.println(" filepath2.toAbsolutePath() "+filepath2.toAbsolutePath());
		System.out.println(" filepath1.toAbsolutePath() "+filepath1.toAbsolutePath());
		
		
		System.out.println(" filepath after Normalize "+filepath.normalize());
		System.out.println(" filepath1 after Normalize "+filepath1.normalize());
		System.out.println(" filepath2 after Normalize "+filepath2.normalize());
		
		System.out.println(filepath2.getNameCount()); // number of folders
		System.out.println(filepath2.getName(0));
		System.out.println(""+filepath2.getName(0));
		
		System.out.println("Parent dir are "+filepath.getParent());
		
		Path p7 = Paths.get("c:\\temp\\test.txt");
		Path p8 = Paths.get("report.pdf"); 
		System.out.println("after resolve "+p7.resolve(p8));
		
		
		Path p4 = Paths.get("d:\\photos\\goa"); 
		Path p5 = Paths.get("d:\\photos\\goa\\index.html");
		Path p6 = p4.relativize(p5);
		System.out.println(p6);
		System.out.println(p6.toAbsolutePath()); // need to check
		
		Path p1 = Paths.get("photos\\goa"); 
		Path p2 = Paths.get("\\index.html");
		Path p3 = p1.relativize(p2); // this will through exception as p2 is not related to p1
		System.out.println(p3);
		
		
		
	}
}
