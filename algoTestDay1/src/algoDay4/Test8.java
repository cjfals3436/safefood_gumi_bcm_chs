package algoDay4;

public class Test8 {

	public static void main(String[] args) {
		int num = fibo(50);
		System.out.println(num);
	}
	static int[] data = new int[100];
	public static int fibo(int num) {
		if(num <= 2)
		return 1;
		if(data[num] == 0) {
			data[num] = fibo(num-1) + fibo(num-2);
		}
		return data[num];
	}
	
}
