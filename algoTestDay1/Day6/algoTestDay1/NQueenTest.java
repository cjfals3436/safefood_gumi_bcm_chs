package algoTestDay1;

public class NQueenTest {

	public static void main(String[] args) {
		int num = 4;
		simulation(num);
	}
	static void simulation(int num) {
		int[] arr = new int[num];
		backtracking(arr,0);
	}
	static void backtracking(int[] arr,int level) {
		if(level == arr.length) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i = 0; i < arr.length; i++) {
			arr[level] = i;
			if(isPromissing(arr,level)) {
			backtracking(arr, level + 1);
			}
		}
	}
	static boolean isPromissing(int[] arr, int level) {
		for(int i = 0; i < level; i++) {
			if(arr[i] == arr[level]) {
				return false;
			}
			else if(arr[i] - (level - i) == arr[level] || arr[i] + (level - i) == arr[level]) {
				return false;
			}
		}
		return true;
	}
}
