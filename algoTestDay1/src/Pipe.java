import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Pipe {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] arr;
		int[] t;
		ArrayList<Integer> list;
		int T,answer,j,temp;
		String str;
		Stack<Integer> stack;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			str = br.readLine();
			arr = str.toCharArray();
			stack = new Stack<>();
			list = new ArrayList<>();
			j=0;
			t = new int[arr.length];
			for(int i =0;i<arr.length;i++) {
				if(arr[i] == '(') {
					stack.push(i);
				}
				else {
					temp = stack.pop();
					if(i - temp != 1) {
						for(int k = temp;k < i;k++) {
							t[k]++;
						}
						j++;
					}
					else {
						list.add(temp);
					}
				}
			}
			answer = j;
			Iterator<Integer> it = list.iterator();
			while(it.hasNext()) {
				answer += t[it.next()];
				
			}
			
			bw.write("#"+testCase+" "+answer+'\n');
			bw.flush();
		}
	}
}
