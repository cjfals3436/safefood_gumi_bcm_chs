
public class JComplex {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int[][] delta = {{0,1},{0,-1},{1,0},{-1,0}};
		int x,y,sum,temp,length=arr.length;
		for(int i=0,cnt=1;i<length;i++) {
			for(int j=0;j<length;j++) {
				arr[i][j]=cnt++;
			}
		}
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
