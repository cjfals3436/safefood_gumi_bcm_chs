import java.lang.reflect.Array;

public class CountingSort {
	static int[] arr = {5,4,9,5,2,1,1,6,8,4,5,5,3,7,3,3};
	static int length, max;
	public static void main(String[] args) {
		length = arr.length;
		max=0;
		for(int i=0;i<length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		int[] temp = new int[max+1];
		int[] result = new int[length+1];
		
		for(int i =0;i<length;i++) {
			temp[arr[i]]++;
		}
		
		for(int i=1;i<=max;i++) {
			temp[i] = temp[i] + temp[i-1];
		}
		
		for(int i = length-1;i>=0;i--) {
			result[temp[arr[i]]]=arr[i];
			temp[arr[i]]--;
		}
		for(int i=1;i<=length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
