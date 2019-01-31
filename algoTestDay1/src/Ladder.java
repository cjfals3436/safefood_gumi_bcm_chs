import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ladder {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int way,j;
		int startY=-1,startX=-1;
		int[][] arr = new int[100+2][100+2];
		int[][] delta = {{-1,0},{0,-1},{0,1}};
		for(int testCase = 1; testCase <= 10; testCase++) {
			Integer.parseInt(br.readLine());
			for(int i = 1; i <= 100; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				j=1;
				while(st.hasMoreTokens()) {
					arr[i][j++] = Integer.parseInt(st.nextToken());
				}
			}
			for(int i = 1; i <= 100; i++) {
				if(arr[100][i] == 2) {
					startX = i;
					startY = 100;
					break;
				}
			}
			way = 0;
			while(startY!=0) {
				if(way == 0) {
					if(arr[startY][startX-1] == 1) {
						way = 1;
					}
					else if(arr[startY][startX+1] == 1) {
						way = 2;
					}
				}
				else {
					if(arr[startY-1][startX] == 1) {
						way = 0;
					}
				}
				startY += delta[way][0];
				startX += delta[way][1];
			}
			bw.write("#"+testCase+" "+(startX-1)+"\n");
			bw.flush();
		}

	}

}
