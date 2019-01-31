import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EightNum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T,N,cnt,min,pos=0;
		int[][] dp = new int[301][3];
		int[] arr = new int[8];

		for(int testase = 1; testase <= 10; testase++) {


			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			cnt = 0;
			min = Integer.MAX_VALUE;
			while(st.hasMoreTokens()) {
				arr[cnt] = Integer.parseInt(st.nextToken());
				cnt++;
			}
			cnt=0;
			min = 0;
			while(true) {
				if(arr[cnt%8] - ((min%5)+1) <= 0) {
					arr[cnt%8] = 0;
					break;
				}
				arr[cnt%8] -= ((min%5)+1);
				min++;
				cnt++;
			}
			System.out.print("#"+testase+" ");
			for(int i = cnt%8+1; i < 8; i++) {
				System.out.print(arr[i]+" ");
			}
			for(int i = 0; i <= cnt%8; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		br.close();
	}
}
