package algoTestDay1;

public class Test6 {

	public static void main(String[] args) {
		int[] arr = {1,5,7,9,8};
		int min=0,temp,minidx;
		for(int i = 0;i<arr.length-1;i++) {
			min=arr[i];
			minidx = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < min) {
					min = arr[j];
					minidx = j;
				}
			}
			if(minidx!=i) {
//				temp=arr[i];
				arr[i] = arr[minidx];
				arr[minidx] = min;
			}
		}

		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
