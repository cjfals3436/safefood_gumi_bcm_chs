package algoDay4;

public class Stringmatch {

	public static void main(String[] args) {
		String s ="hiabcasdggawabrhelloadfabcdefgasemklasoinkmaabcdabclkhvpiaaasdcETUN";
		String str = "abcdabc";
		find(s,str);
		int idx = s.indexOf(str);
		System.out.println(idx);
	}
	static void find(String s, String str) {
		boolean b;
		int j;
		for(int i =0;i<s.length()-str.length();i++) {
			b=true;
			for(j =0;j<str.length();j++) {
				if(s.charAt(i+j) != str.charAt(j)) {
					b=false;
					break;
				}
			}
			if(b) {
				System.out.println("있음");
				System.out.println(i);
				break;
			}
		}
	}
	static void KMP(String s, String str) {
		int[] arr = new int[str.length()];
		
		
	}
}
