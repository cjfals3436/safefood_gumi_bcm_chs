package algoTestDay1;

public class Test5 {
	static boolean[] flags;
	public static void main(String[] args) {
		int num=5;
		int mum2=9;
		int num3= 5 ^9 ;
		num3 = 1<<3;int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		method1(arr);
	}
	static void method1(int[] arr) {
		int size = 1 << arr.length;
		for(int i =0;i<size;i++) {
			for(int j=0;j<arr.length;j++) {
				if((i&(1<<j)) != 0) {
					System.out.print(arr[j]+" ");
				}
			}
			System.out.println();
		}
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
