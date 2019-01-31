package sam;

public class TreeTest {

	public static void main(String[] args) {
		char[] tree = {'\u0000','A','B','C','D','E','F','G','H','I','J','\u0000','\u0000','\u0000','\u0000','\u0000',};
		
		postorder(tree,1);
		
	}
	public static void preorder(char[] tree,int idx) {
		if(idx >= tree.length||tree[idx] == '\u0000') {
			return;
		}
		System.out.print(tree[idx]+" ");
		preorder(tree,idx*2);
		preorder(tree,idx*2+1);
	}
	public static void inorder(char[] tree,int idx) {
		if(idx >= tree.length||tree[idx] == '\u0000') {
			return;
		}
		inorder(tree,idx*2);
		System.out.print(tree[idx]+" ");
		inorder(tree,idx*2+1);
	}
	public static void postorder(char[] tree,int idx) {
		if(idx >= tree.length||tree[idx] == '\u0000') {
			return;
		}
		postorder(tree,idx*2);
		postorder(tree,idx*2+1);
		System.out.print(tree[idx]+" ");
	}
}
