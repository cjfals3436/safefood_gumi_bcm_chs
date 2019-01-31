package sam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class LinkedTree2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt() - 1;
		int root=0,x;
		Node2 temp;
		Map<Integer, Node2> map = new HashMap<>();
		int a,b,max=0;
		for(int i = 0; i < T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+" "+b);
			if(!map.containsKey(a)) {
				map.put(a, new Node2(a));
			}
			if(!map.containsKey(b)) {
				map.put(b, new Node2(b));
			}
			if(map.get(a).getLeft() == null) {
				map.get(a).setLeft(map.get(b));
			}
			else {
				map.get(a).setRight(map.get(b));
			}
			if(max<a) {
				max = a;
			}
			if(max<b) {
				max = b;
			}
		}
		Iterator<Node2> it = map.values().iterator();
		boolean[] r = new boolean[max+1];
		while(it.hasNext()) {
			temp = it.next();
			if(temp.getLeft() != null) {
				r[temp.getLeft().getData()] = true;
			}
			if(temp.getRight() != null) {
				r[temp.getRight().getData()] = true;
			}
		}
		Iterator<Integer> it2 = map.keySet().iterator();
		while(it2.hasNext()) {
			x = it2.next();
			if(!r[x]) {
				root = x;
				break;
			}
		}
				preorder(map.get(root));
//		preorder(map.get(1));
	}
	static void preorder(Node2 node) {
		System.out.println(node.getData());
		if(node.getLeft() != null) {
			preorder(node.getLeft());
		}
		if(node.getRight() != null) {
			preorder(node.getRight());
		}
	}

	static void inorder(Node2 node) {
		if(node.getLeft() != null) {
			inorder(node.getLeft());
		}
		System.out.println(node.getData());
		if(node.getRight() != null) {
			inorder(node.getRight());
		}
	}
	static void postorder(Node2 node) {
		if(node.getLeft() != null) {
			postorder(node.getLeft());
		}
		if(node.getRight() != null) {
			postorder(node.getRight());
		}
		System.out.println(node.getData());
	}
}
class Node2{
	private int data;
	private Node2 left;
	private Node2 right;
	public Node2(int data){
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node2 getLeft() {
		return left;
	}
	public void setLeft(Node2 left) {
		this.left = left;
	}
	public Node2 getRight() {
		return right;
	}
	public void setRight(Node2 right) {
		this.right = right;
	}

}