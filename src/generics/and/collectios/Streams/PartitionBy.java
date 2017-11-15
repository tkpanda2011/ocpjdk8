package generics.and.collectios.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitionBy {

	public static void main(String[] args) {

//Given:
List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17); //1
//Stream<Integer> primeStream = primes.stream(); //2

Predicate<Integer> test1 = k->k<10; //3
long count1 = primes.stream().filter(test1).count();//4

Predicate<Integer> test2 = k->k>10; //5
long count2 = primes.stream().filter(test2).count(); //6

System.out.println(count1+" "+count2); //7

//below one makes the stream into partitions and returns the collections Collection<List<Integer>> 
//than applies the Collectors.counting() which counts number of elements and finally returns a collction of counts

primes.stream().collect(Collectors.partitioningBy(test2 , Collectors.counting())).values().forEach(System.out::println);



//below one makes the stream into partitions and returns the collections Collection<List<Integer>> 
primes.stream().collect(Collectors.partitioningBy(test2)).values().forEach(System.out::println);

	}

}
