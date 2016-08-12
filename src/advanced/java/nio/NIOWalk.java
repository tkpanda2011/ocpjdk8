package advanced.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NIOWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Find all unsecure services
		Path path = Paths.get("D:\\JBOSS_6_APPS\\Emirates_2.8.0\\Middleware\\EmiratesAppProxy\\src\\main\\java\\com\\emirates\\ibe\\mobile\\ws");
		try (Stream<Path> pathStream = Files.walk(path, 3)) {
			pathStream.filter( path2 -> path2.toAbsolutePath().toString().contains("unsecure\\")).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
