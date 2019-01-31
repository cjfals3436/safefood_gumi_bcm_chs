package algoDay4;

public class Test9 {

	public static void main(String[] args) {
		int[][] data = new int[7+1][7+1];
		data[1][2] =1;
		data[2][1] =1;
		data[1][3] =1;
		data[3][1] =1;
		data[2][4] =1;
		data[4][2] =1;
		data[2][5] =1;
		data[5][2] =1;
		data[3][5] =1;
		data[5][3] =1;
		data[4][6] =1;
		data[6][4] =1;
		data[5][6] =1;
		data[6][5] =1;
		data[7][6] =1;
		data[6][7] =1;
		for(int i = 1; i < data.length; i++) {
			for(int j = 1; j < data.length; j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		boolean[] check = new boolean[7+1];
		dfs(data,check,1);
	}
	static void dfs(int[][] arr,boolean[] check,int start) {
		System.out.print(start+" ");
		check[start] = true;
		for(int i = 1; i < check.length; i++) {
			if(arr[start][i] == 1 && !check[i]) {
				dfs(arr,check,i);
			}
		}
	}

}
