import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Russia {

	static int T,N,M, answer;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int i, temp,temp2;
		char[][] arr = new char[51][51];
		int[][] color = new int[51][3];
		int[][] set = new int[1251][3];
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			i=0;
			for(int j=0;j<N;j++) {
				arr[j] = br.readLine().toCharArray();
				color[j][0]=0;
				color[j][1]=0;
				color[j][2]=0;
			}
			for(int j=0;j<N;j++) {
				for(int k=0;k<M;k++) {
					switch(arr[j][k]) {
					case 'W':
						color[j][0]++;
						break;
					case 'B':
						color[j][1]++;
						break;
					case 'R':
						color[j][2]++;
						break;
					}
				}
			}
			answer=0;
			answer += color[0][1] + color[0][2] + color[N-1][1] + color[N-1][0];
			i=1;
			for(int j=0;j<N-2;j++) {
				for(int k = N-2-1-j; k>=0;k--) {
					if(N-2-j-k != 0) {
					set[i][0] = j;
					set[i][2] = k;
					set[i++][1] = N-2-j-k;
					}
				}
			}
			temp=Integer.MAX_VALUE;
			for(int j=1;j<i;j++) {
				temp2=0;
				int x = 1;
					for(int k=0;k<set[j][0];k++,x++) {
						temp2 += color[x][1] + color[x][2];
					}
					for(int k=0;k<set[j][1];k++,x++) {
						temp2 += color[x][0] + color[x][2];
					}
					for(int k=0;k<set[j][2];k++,x++) {
						temp2 += color[x][1] + color[x][0];
					}
					if(temp > temp2) {
						temp = temp2;
					}
			}
			
			bw.write("#"+testCase+" "+(answer+temp)+"\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}

}