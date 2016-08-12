package advanced.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NIOStreamExampleFilterFiles {

	public static void main(String[] args) {
		Path path = Paths.get("D:\\JBOSS_6_APPS\\Emirates_2.8.0\\Middleware\\EmiratesAppProxy\\src\\main\\java\\com\\emirates\\ibe\\mobile\\ws\\restful\\secure");
		
		try(Stream<Path> pathStream = Files.list(path)) {
			
			System.out.println("And wha i Found "+pathStream.findAny().get()); 
			
			pathStream.filter( path2 -> path2.toString().endsWith(".java")).forEach(System.out::println);
			
			System.out.println("And wha i Found "+pathStream.findAny().get());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
