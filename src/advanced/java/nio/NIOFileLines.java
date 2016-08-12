package advanced.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NIOFileLines {

	public static void main(String[] args) {
		
		
		Path path = Paths.get("D:\\JBOSS_6_APPS\\Emirates_2.8.0\\Middleware\\EmiratesAppProxy\\src\\main\\java\\com\\emirates\\ibe\\mobile\\ws\\restful\\secure\\SkywardsServices.java");
		
		// get the Content of all unsecure Services. 
		
		try (Stream<String> pathstream = Files.lines(path)) {
		
		pathstream.forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
