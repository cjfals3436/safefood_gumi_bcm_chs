package algoDay4;

public class SSAFYStack {
	private char[] stack = null;
	private int top;
	public SSAFYStack(){
//		stack = new char[100];
		this(100);
	}
	public SSAFYStack(int size){
		stack = new char[size];
		top = -1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == stack.length-1;
	}
	public int size() {
		return top + 1;
	}
	public void push(char data) {
		if(isFull()) {
			System.out.println("overflow");
			return;
		}
		top++;
		stack[top] = data;
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("overflow");
			return '\u0000';
		}
		return stack[top--];
	}
	public char peek() {
		if(isEmpty()) {
			System.out.println("overflow");
			return '\u0000';
		}
		return stack[top];
	}
	
}
