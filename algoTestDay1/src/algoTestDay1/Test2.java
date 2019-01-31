package algoTestDay1;

public class Test2 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int idx = 0, delta = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][idx]+"\t");
				idx += delta;
			}
			delta *= -1;
			idx += delta;
			System.out.println();
		}
	}

}
