package algoTestDay1;

public class MyQueue2 {
	private char[] queue;
	private int front,rear,size;
	public MyQueue2() {
		this(10);
	}
	public MyQueue2(int size){
		this.queue = new char[size];
		this.front = 0;
		this.rear = 0;
		this.size = 0;
	}
	
	public void enQueue(char item) {
		if(!this.isFull()) {
			rear = (rear+1) % queue.length;
			queue[rear] = item;
			size++;
			return;
		}
		System.out.println("OverFlow");
	}
	public char qPeek() {
		char item='\u0000';
		if(!this.isEmpty()) {
			item = queue[(front+1) % queue.length];
		}
		return item;
	}
	public char deQueue() {
		char item='\u0000';
		if(!this.isEmpty()) {
			front = (front+1) % queue.length;
			item = queue[front];
			size--;
		}
		else {
			System.out.println("OverFlow");
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
		if((rear+1) % queue.length == front) {
			return true;
		}
		return false;
	}
	public int size() {
		return size;
	}
}
