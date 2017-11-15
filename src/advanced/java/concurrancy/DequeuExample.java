package advanced.java.concurrancy;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeuExample {

	public static void main(String[] args) {
	 Deque<Integer> d = new ArrayDeque<>();
		d.push(1); 
		System.out.println(d);//1
		d.offerLast(2);
		System.out.println(d);//12
		d.push(3); 
		System.out.println(d);//312
		d.peekFirst(); 
		System.out.println(d);// 312 peekFirst but not removes
		d.removeLast();
		System.out.println(d); //31
		d.pop();
		System.out.println(d); //1

	}

}
