package advanced.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NIOStreamExample {

	public static void main(String[] args) {
		
		Path path = Paths.get("D:\\JBOSS_6_APPS\\Emirates_2.8.0\\Middleware\\EmiratesAppProxy\\src\\main\\java\\com\\emirates\\ibe\\mobile\\ws\\restful\\secure");
			
		traversePath(path);
	}

	private static String traversePath(Path path) {
		System.out.println("Path called");
		
		try (Stream<Path> stream = Files.list(path)) {
			
			stream.peek(filePah -> System.out.println("Looking Now "+filePah))
			.map(filePath -> filePath.toFile().isDirectory() ? traversePath(filePath) : isFile(filePath)).forEach(System.out::println);;
		} catch (IOException e) {
			System.out.println("failed to traverse "+path);
		}
		
		return "";
	}
public static String isDirectory(Path filepath ) {
	return null;
}

public static String isFile(Path filePath) {
//	System.out.println("File name is"+filePath.toAbsolutePath());
	
	return "";
}
}
