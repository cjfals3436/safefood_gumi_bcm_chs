
public class Five {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int[][] delta = {{0,1},{0,-1},{1,0},{-1,0}};
		int x,y,sum,temp;
		for(int i=0,cnt=1;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=cnt++;
			}
		}
		sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<4;k++) {
					y = i + delta[k][0];
					x = j + delta[k][1];
					if(x>=0&&x<arr[i].length&&y>=0&&y<arr.length) {
						temp = arr[i][j] - arr[y][x];
						if(temp < 0) {
							temp *= -1;
						}
						sum += temp;
					}
				}
			}
		}
		System.out.println(sum);
	}

}
