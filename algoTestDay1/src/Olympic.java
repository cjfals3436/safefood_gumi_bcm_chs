import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Olympic {

	static int T,N,K, answer;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int i, temp,jj;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			i=0;
			int[] game = new int[N];
			int[] man = new int[K];
			int[] vote = new int[N];
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				game[i++] = Integer.parseInt(st.nextToken());
			}
			i=0;
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				man[i++] = Integer.parseInt(st.nextToken());
			}
			answer=0;
			for(i = 0; i < K; i++) {
				temp = -1;
				for(int j = N-1; j >= 0; j--) {
					if(man[i] >= game[j]){
						temp = j;
					}
				}
				vote[temp]++;
			}
			temp = 0;
			for(int j = 0; j < N; j++) {
				if(temp < vote[j]) {
					temp = vote[j];
					answer = j;
				}
			}
			bw.write("#"+testCase+" "+(answer+1)+"\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
