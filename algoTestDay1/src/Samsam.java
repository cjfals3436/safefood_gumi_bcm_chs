import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Samsam {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T, N, M, length;
		String answer = "";
		char[] color;
		int[] num;
		String numStr, colorStr;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			
			numStr = br.readLine();
			colorStr = br.readLine();
			length = colorStr.length();
			color = numStr.toCharArray();
			num = new int[length];
			for(int i = 0; i < length; i++) {
				num[i] = color[i] - '0';
			}
			
			
			

			bw.write("#"+testCase+" "+answer+"\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}

}