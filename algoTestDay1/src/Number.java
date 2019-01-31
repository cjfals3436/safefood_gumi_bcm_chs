import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Number {
	static int T,N,answer;
	static int[] arr = new int[100];
	static int[] num = new int[5052];
	static int[] numTemp = new int[5052];
	static int[] result = new int[5052];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int idx, cnt=0;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			idx=0;
			for(int i = 0; i < N; i++) {
				arr[i]=0;
			}
			for(int i = 0; i <= cnt; i++) {
				result[num[i]]=0;
				num[i]=0;
				numTemp[i]=0;	
			}
			while(st.hasMoreTokens()){
				arr[idx++] = Integer.parseInt(st.nextToken());
			}
			cnt=0;
			num[0]=0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= cnt; j++) {
					numTemp[j] = num[j] + arr[i];
				}
				for(int j=0;j<=cnt;j++) {
					if(result[numTemp[j]]==0) {
						num[cnt++]=numTemp[j];
						result[numTemp[j]]=1;
					}
				}
			}
			System.out.println("#"+testCase+" "+cnt);
		}
		
		br.close();
		bw.close();
	}

}
