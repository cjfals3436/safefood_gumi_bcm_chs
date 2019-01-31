public class Snail {
	public static void main(String[] args) {
		int N = 5;
		int length=N, x=0, y=0,dis=0;
		int[][] delta = {{1,0},{0,-1},{-1,0},{0,1}};
		int[][] arr = new int[N][N];
		int[][] random = {{9,20,2,18,11},
						{19,1,25,3,21},
						{8,24,10,17,7},
						{15,4,16,5,6},
						{12,13,22,23,14}};
		int cy,cx,tempY,tempX,num,temp;
		
		for(int i = 0;i<N;i++) {
			for(int j=0;j<N;j++) {
				tempY=i;
				tempX=j;
				num=random[i][j];
				for(int jj=j;jj<N;jj++) {
					if(num > random[i][jj]) {
						tempY = i;
						tempX = jj;
						num = random[i][jj];
					}
				}
				for(int ii = i+1;ii<N;ii++) {
					for(int jj=0;jj<N;jj++) {
						if(num > random[ii][jj]) {
							tempY = ii;
							tempX = jj;
							num = random[ii][jj];
						}
					}
				}
				if(num != random[i][j]) {
					temp = random[tempY][tempX];
					random[tempY][tempX] = random[i][j];
					random[i][j] = temp;
				}
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(random[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		arr[0][0]=1;
		for(int i = 2; i <= N; i++) {
			x += delta[3][1];
			y += delta[3][0];
			arr[y][x]=i;
		}
		length--;
		for(int i = N + 1; i <= N*N;) {
			for(int j =0;j<length;j++) {
				x += delta[dis%4][1];
				y += delta[dis%4][0];
				arr[y][x] = i++;
			}
			dis++;
			for(int j =0;j<length;j++) {
				x += delta[dis%4][1];
				y += delta[dis%4][0];
				arr[y][x] = i++;
			}
			dis++;
			length--;
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
