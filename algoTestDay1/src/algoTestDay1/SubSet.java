package algoTestDay1;

public class SubSet {
	static boolean[] flag;
	public static void main(String[] args) {
		int[] arr = {-7,-3,-2,5,8};
		find(arr);
	}
	
	static void find(int[] arr) {
		flag = new boolean[arr.length];
		int size = 1 << arr.length;
		for(int i =0;i<size;i++) {
			for(int j = 0; j<arr.length ;j++) {
				if((i&(1<<j)) != 0) {
					flag[j] = true;
				}
				else {
					flag[j]=false;
				}
			}
			isZero(arr);
		}
	}
	static void isZero(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(flag[i]) {
				sum += arr[i];
			}
		}
		if(sum==0) {
			for(int i=0;i<arr.length;i++) {
				if(flag[i]) {
				System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
		}
	}
}
