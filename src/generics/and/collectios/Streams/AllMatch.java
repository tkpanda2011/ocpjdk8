package generics.and.collectios.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AllMatch {

	public static void main(String[] args) {

//What will the following code print?

        List<String> ls = Arrays.asList("Tom Hart","Tom Cruise",  "Tom Hanks", "Tom Brady");
        Predicate<String> p = str->{
            System.out.println("Looking...");
            return str.indexOf("Tom") > -1;
        };
        boolean flag = ls.stream().filter(str->str.length()>8).allMatch(p);


	}

}
