package algoTestDay1;

import algoTestDay1.MyQueue4.Node;

public class QueueTest {

	public static void main(String[] args) {
		MyQueue4 queue = new MyQueue4();
		
		
		queue.enQueue('F');
		queue.enQueue('C');
		queue.enQueue('B');
		queue.enQueue('A');
		queue.enQueue('D');
		
		Node node = queue.getFront();
		while(node != null) {
			
			System.out.println(node.getData());
			node = node.getNext();
		}
		
	
	}

}
