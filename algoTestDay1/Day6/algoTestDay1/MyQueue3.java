package algoTestDay1;

public class MyQueue3 {
	private Node front,rear;
	
	public MyQueue3(){
		this.front = null;
		this.rear = null;
	}
	
	public Node getFront() {
		return front;
	}

	public void setFront(Node front) {
		this.front = front;
	}

	public Node getRear() {
		return rear;
	}

	public void setRear(Node rear) {
		this.rear = rear;
	}

	public void enQueue(char item) {
		
		Node node = new Node(item);
		if(front == null) {
			rear = node;
			front = node;
		}
		else {
			rear.next = node;
			rear = node;
		}
	}
	public char qPeek() {
		char item='\u0000';
		if(isEmpty()) {
			System.out.println("overflow");
		}
		else {
			item = front.data;
		}
		return item;
	}
	public char deQueue() {
		char item='\u0000';
		if(isEmpty()) {
			System.out.println("overflow");
		}
		else {
//			Node old = front;
			item = front.data;
			front = front.next;
			if(isEmpty()) {
				rear = null;
			}
			
		}
		return item;
	}
	public boolean isEmpty() {
		if(front == null) {
			return true;
		}
		return false;
	}
	public class Node{
		private Character data;
		private Node next;
		public Character getData() {
			return data;
		}
		public void setData(Character data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node(Character data) {
			this.data = data;
			this.next = null;
		}
	}
}
