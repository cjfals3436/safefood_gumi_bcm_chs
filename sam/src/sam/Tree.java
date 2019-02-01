package sam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tree {
	static int T,temp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Node> map = new HashMap<>();
		String[] strs;
		String str;

		for(int testCase = 1; testCase <= 10; testCase++) {
			T = sc.nextInt();
			str = sc.nextLine();
			map.clear();
			for(int i = 1; i <= T; i++) {
				str = sc.nextLine();
				strs = str.split(" ");
				if(strs.length == 4) {
					if(!map.containsKey(strs[0])) {
						map.put(strs[0], new Node());
					}
					map.put(strs[2], new Node());
					map.put(strs[3], new Node());
					map.get(strs[0]).setData(strs[1].charAt(0));
					map.get(strs[0]).setLeft(map.get(strs[2]));
					map.get(strs[0]).setRight(map.get(strs[3]));
				}
				else {
					map.get(strs[0]).setNum(Double.parseDouble(strs[1]));
				}
			}
			System.out.printf("# %d %.0f\n",testCase,order(map.get("1")));
		}
		sc.close();
	}
	static double order(Node node) {
		if(node.getLeft() == null&& node.getRight() ==null) {
			return node.getNum();
		}
		double left,right,result=0;

		left = order(node.getLeft());
		right = order(node.getRight());

		switch(node.getData()) {
		case '-':
			result = (left - right);
			break;
		case '+':
			result = (left + right);
			break;
		case '/':
			result = (left / right);
			break;
		case '*':
			result = (left * right);
			break;
		}

		return result;
	}
	static class Node{
		private char data;
		private double num;

		private Node left;
		private Node right;
		public Node(){

		}
		public double getNum() {
			return num;
		}
		public void setNum(double num) {
			this.num = num;
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
}
