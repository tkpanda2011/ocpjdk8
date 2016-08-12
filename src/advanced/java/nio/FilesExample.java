package advanced.java.nio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * •	Use Path interface to operate on file and directory paths
•	Use Files class to check, read, delete, copy, move, manage metadata of a file or directory
•	Use Stream API with NIO.2

 * @author s717974
 *
 */
public class FilesExample {

	public static void main(String[] args)  {
		
		
		Path path = Paths.get("D:\\jdk8\\test\\test1\\test2\\test3\\test.txt");
		Path path2 = Paths.get("D:\\jdk8\\test\\test1\\test2\\test3\\test2.txt");
		// check files exist or not 
		System.out.println(Files.exists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS}));
		System.out.println(Files.notExists(path2, new LinkOption[]{LinkOption.NOFOLLOW_LINKS}));
		
		try {
			System.out.println(new String(Files.readAllBytes(path)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // Read All bytes
		
		try {
			System.out.println("Reading All Lines"+Files.readAllLines(path));
			
			Files.readAllLines(path, Charset.defaultCharset());
			
			Files.deleteIfExists(path2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Path p = Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);
			System.out.println(p);
		} catch (FileAlreadyExistsException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
