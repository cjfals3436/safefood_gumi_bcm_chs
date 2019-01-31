package algoTestDay1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test1 {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		queue.offer(3);
		queue.offer(6);
		queue.offer(1);
		queue.offer(2);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
		
//		Queue<Character> queue = new LinkedList<>();
//		
//		queue.offer('a');
//		queue.offer('c');
//		queue.offer('d');
//		queue.offer('b');
//		
//		System.out.println(queue.poll());
	}

}
