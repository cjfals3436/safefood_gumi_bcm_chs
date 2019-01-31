
public class PermTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		perm(arr,0);
	}
	static void perm(int [] arr,int pivot) {
		if(pivot == arr.length) {
			print(arr);
			System.out.println();
			return;
		}
		for(int i = pivot;i<arr.length;i++) {
			swap(arr,i,pivot);
			perm(arr,pivot+1);
			swap(arr,i,pivot);
		}
	}
	
	static void print(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void swap(int[] arr,int i, int pivot) {
		int temp;
		temp=arr[i];
		arr[i]=arr[pivot];
		arr[pivot] = temp;
	}
}
