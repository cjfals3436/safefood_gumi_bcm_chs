package algoDay4;

public class Teat3 {

	public static void main(String[] args) {
		String s = "Algorihm";
		String s1 = doReverse(s);
		System.out.println(s1);
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		s1 = sb.toString();
		System.out.println(s1);
	}
	static String doReverse(String s) {
		char[] arr = s.toCharArray();
		int size = arr.length/2;
		char temp;
		for(int i = 0;i<size;i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
//		String result = new String(arr);
		String result = String.valueOf(arr);
		return result;
	}
}
