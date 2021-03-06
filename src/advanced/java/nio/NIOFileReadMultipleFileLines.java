package advanced.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NIOFileReadMultipleFileLines {

	public static void main(String[] args) {
		Path path = Paths.get("D:\\JBOSS_6_APPS\\Emirates_2.8.0\\Middleware\\EmiratesAppProxy\\src\\main\\java\\com\\emirates\\ibe\\mobile\\ws");
		try (Stream<Path> pathStream = Files.walk(path, 3)) {
			try {
				pathStream.filter( path2 -> path2.toAbsolutePath().toString().contains("unsecure\\")).forEach(
						path4 -> {try (Stream<String> stream = Files.lines(path4)) {
							stream.forEach(System.out::println);
						} catch (Exception e) {
							
						} }
						);
				

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
