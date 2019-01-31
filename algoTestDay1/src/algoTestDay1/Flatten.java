package algoTestDay1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Flatten {
	static int T,answer;
	static int N,temp, B, cnt, low=0, high=0, lowTemp=0, highTemp=0;
	static int[] arr = new int[101];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		for(int testCase = 1; testCase <= 10; testCase++) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			cnt=0;
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=0;
			}
			while(st.hasMoreTokens()){
				arr[Integer.parseInt(st.nextToken())]++;
			}
			for(int i=1;i<=arr.length;i++) {
				if(arr[i]!=0) {
					low=i;
					break;
				}
			}
			
			
			for(int i = arr.length-1;i>0;i--) {
				if(arr[i]!=0) {
					high=i;
					break;
				}
			}
					
			for(int i = 0; i< N;i++) {
				if(low>=high) {
					break;
				}
				arr[low]--;
				arr[low+1]++;
				arr[high]--;
				arr[high-1]++;
				if(arr[high]==0) {
					high--;
				}
				if(arr[low]==0) {
					low++;
				}
			}
			System.out.println("#"+testCase+" "+(high-low));
		}
		
		br.close();
		bw.close();
	}
}
