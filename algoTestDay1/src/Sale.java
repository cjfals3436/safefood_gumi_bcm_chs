import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Sale {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T, N, answer;
		ArrayList<Integer> arr;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			
			N = Integer.parseInt(br.readLine());
			arr = new ArrayList<>();
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(arr);
			Collections.reverse(arr);
			answer=0;
			for(int i = 0; i < arr.size(); i++) {
				if(i%3 !=2) {
					answer += arr.get(i);
				}
			}
			bw.write("#"+testCase+" "+answer+"\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}
	
}