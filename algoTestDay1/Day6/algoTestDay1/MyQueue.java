package algoTestDay1;

public class MyQueue {
	private char[] queue;
	private int front,rear;
	public MyQueue() {
		this(10);
	}
	public MyQueue(int size){
		this.queue = new char[size];
		this.front = -1;
		this.rear = -1;
	}
	
	public void enQueue(char item) {
		if(!this.isFull()) {
			rear++;
			queue[rear] = item;
			return;
		}
		System.out.println("OverFlow");
	}
	public char qPeek() {
		char item='\u0000';
		if(!this.isEmpty()) {
			item = queue[front+1];
		}
		return item;
	}
	public char deQueue() {
		char item='\u0000';
		if(!this.isEmpty()) {
			front++;
			item = queue[front];
		
		}
		return item;
	}
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(rear == queue.length-1) {
			return true;
		}
		return false;
	}
	public int size() {
		return rear - front;
	}
}
