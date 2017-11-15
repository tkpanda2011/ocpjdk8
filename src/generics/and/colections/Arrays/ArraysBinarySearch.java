package generics.and.colections.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysBinarySearch {
	static String[] sa = { "d", "bbb", "aaaa" };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.binarySearch(sa, "c", new MyStringComparator());
	}

	
}
class MyStringComparator implements Comparator { 
	public int compare(Object o1, Object o2){
		int s1 = ((String) o1).length();
		int s2 = ((String) o2).length();
		int answer = s1 - s2;
		return answer;
		}
	}