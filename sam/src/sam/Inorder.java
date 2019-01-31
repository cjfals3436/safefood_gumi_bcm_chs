package sam;

import java.util.Scanner;

public class Inorder {
	static int T,temp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] arr = new char[101];
		String[] strs = new String[4];
		String str;

		for(int testCase = 1; testCase <= 10; testCase++) {
			T = sc.nextInt();
			str = sc.nextLine();
			for(int i = 1; i <= T; i++) {
				str = sc.nextLine();
				strs = str.split(" ");
				arr[i] = strs[1].charAt(0);
			}
			System.out.print("#"+testCase+" ");
			inorder(arr,1);
			System.out.println();
		}
	}
	public static void inorder(char[] tree,int idx) {
		if(idx > T||tree[idx] == '\u0000') {
			return;
		}
		inorder(tree,idx*2);
		System.out.print(tree[idx]);
		inorder(tree,idx*2+1);
	}
}
