package algoDay4;

public class Test1 {

	public static void main(String[] args) {
		int num = 654321;
		byte[] arr = intToByteArray(num);
		int numi = byteArrayToInt(arr);
		System.out.println(numi);
	}
	static byte[] intToByteArray(int num) {
		byte[] data = new byte[4];
		data[3] = (byte)num;
		data[2] = (byte)(num>>8);
		data[1] = (byte)(num>>16);
		data[0] = (byte)(num>>24);
		return data;
	}
	static int byteArrayToInt(byte[] arr) {
		int num = 0;
		num = (arr[3] & 0xff) | ((arr[2] & 0xff)<<8) | ((arr[1] & 0xff)<<16) | (arr[0]<<24);
		return num;
	}
}
