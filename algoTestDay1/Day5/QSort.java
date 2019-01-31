
public class QSort {
	public static void main(String[] args) {
		int[] arr = {2,3,4,1,5};
		qSort(arr,0,arr.length-1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	static int partition(int[] arr, int l, int r) {
		int pivot = arr[(l+r) / 2], temp;
		while(l < r) {
			while(arr[l] < pivot && l < r) {
				l++;
			}
			while(pivot < arr[r] && l < r) {
				r--;
			}
			if(l < r) {
				temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
		}
		temp = arr[(l+r) / 2];
		arr[(l+r) / 2] = arr[r];
		arr[r] = temp;
		return r;
	}
	static void qSort(int[] arr, int l, int r) {
		if(l < r) {
			int pivot = partition(arr, l, r);
			qSort(arr,l,pivot-1);
			qSort(arr,pivot+1,r);
		}
	}
}
