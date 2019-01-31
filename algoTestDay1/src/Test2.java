
public class Test2 {
	static int[] arr = {};
	static int length = arr.length;
	public static void main(String[] args) {
		
//		System.out.println(p(1,1,8));
		binary(0, "");
	}
	static int sum(int num) {
		if(num==0) return 1;
		if(num==1) return 1;
		
		return num+sum(--num);
	}
	static int fac(int num) {
		if(num==1) return 1;
		
		return num*fac(--num);
	}
	static int doDigitSum(int num, int sum) {
		if(num<10) return num;
		
		sum = num%10+doDigitSum(num/10, sum);
		return sum;
	}
	static int doSumArr(int num) {
		if(num==0) return arr[0];
		return doSumArr(num-1)+arr[num];
	}
	static String str(int i, String s) {
		if(i==s.length()-1)return s.charAt(i)+"";
		return s.charAt(i)+","+str(i+1,s);
	}
	//string.substring(x,y) x부터 y까지 반환
	
	static int p(int num1, int num2, int s) {
		if(s==2) {
			return num2;
		}
		return p(num2,num1+num2,--s);
	}
	
	static void binary(int n, String s) {
		if(n==3) {
			System.out.println(s);
			return;
		}
		binary(n+1,s+"0");
		binary(n+1,s+"1");
		
	}
}
