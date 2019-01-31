package sam;

public class LinkedTree {

	public static void main(String[] args) {
		Node head = new Node('A');
		head.setLeft(new Node('B'));
		head.setRight(new Node('C'));
		head.getLeft().setLeft(new Node('D'));
		head.getLeft().setRight(new Node('E'));
		head.getLeft().getRight().setLeft(new Node('H'));
		head.getLeft().getRight().setRight(new Node('I'));
		head.getRight().setLeft(new Node('F'));
		head.getRight().setRight(new Node('G'));
		
		preorder(head);
		System.out.println();
		inorder(head);
		System.out.println();
		postorder(head);
	}
	static void preorder(Node node) {
		System.out.println(node.getData());
		if(node.getLeft() != null) {
			preorder(node.getLeft());
		}
		if(node.getRight() != null) {
			preorder(node.getRight());
		}
	}
	
	static void inorder(Node node) {
		if(node.getLeft() != null) {
			inorder(node.getLeft());
		}
		System.out.println(node.getData());
		if(node.getRight() != null) {
			inorder(node.getRight());
		}
	}
	static void postorder(Node node) {
		if(node.getLeft() != null) {
			postorder(node.getLeft());
		}
		if(node.getRight() != null) {
			postorder(node.getRight());
		}
		System.out.println(node.getData());
	}
}
class Node{
	private char data;
	private Node left;
	private Node right;
	public Node(char data){
		this.data = data;
	}
	public char getData() {
		return data;
	}
	public void setData(char data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}

}