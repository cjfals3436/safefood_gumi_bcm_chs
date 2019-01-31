package algoTestDay1;

public class TestPowerSet {
	static boolean[] flags;
	public static void main(String[] args) {
		int[] arr = {-7,-3,-2,4};
		method2(arr);
	}
	static void method1(int[] arr) {
		flags = new boolean[arr.length];
		for(int i = 0; i < 2; i++) {
			flags[0] = i % 2 == 0 ? true : false;
			for(int j = 0; j < 2; j++) {
				flags[1] = j % 2 == 0 ? true : false;
				for(int k = 0; k < 2; k++) {
					flags[2] = k % 2 == 0 ? true : false;
					for(int l = 0; l < 2; l++) {
						flags[3] = l % 2 == 0 ? true : false;
						printArr(arr);
					}
					
				}
				
			}
			
		}
	}
	static void method2(int[] arr) {
		flags = new boolean[arr.length];
		powerSet(arr,0,arr.length);
	}
	static void powerSet(int[] arr,int depth,int maxDepth) {
		if(depth == maxDepth) {
			printArr(arr);
			return;
		}
		flags[depth] = true;
		powerSet(arr,depth+1,maxDepth);
		flags[depth] = false;
		powerSet(arr,depth+1,maxDepth);
	}
	static void printArr(int[] arr) {
		for(int i = 0; i < flags.length; i++) {
			if(flags[i]) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
}
