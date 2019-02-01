package sam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Plus {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T,X,Y,O,N,M,sum,orderidx,result;
		String[] strs;
		for(int testCase = 1; testCase <= 10; testCase++) {
			result = 1;
			N = Integer.parseInt(br.readLine());
			for(int i = 1; i <= N; i++) {
				strs = br.readLine().split(" ");
				if(strs.length == 4 && isDigit(strs[1])) {
					result = 0;
				}
				else if(strs.length == 3) {
					result = 0;
				}
				else if(strs.length == 2 && !isDigit(strs[1])) {
					result = 0;
				}
			}
			bw.write("#"+testCase+" "+result+"\n");
			
			
		}
		br.close();
		bw.close();	
	}
	public static boolean isDigit(String s) {
		if(s.charAt(0) == '-') {
			return false;
		}
		if(s.charAt(0) == '+') {
			return false;
		}
		if(s.charAt(0) == '*') {
			return false;
		}
		if(s.charAt(0) == '/') {
			return false;
		}
		return true;
	}

}
