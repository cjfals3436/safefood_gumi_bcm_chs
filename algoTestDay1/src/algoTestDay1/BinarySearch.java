package algoTestDay1;

public class BinarySearch {
	static int[] arr = {1,3,4,5,9,10,12,16,18,19,21}; //정렬된 배열
	public static void main(String[] args) {
		search(9);//(S,M,E),(0,5,10),(0,2,4),(3,3,4),(4,4,4)
		search(11);//(0,5,10),(6,8,10),(6,6,7),(6,,5)fail
		search(21);//(0,5,10),(6,8,10),(9,9,10),(10,10,10)
		search2(3,0,arr.length-1);//(0,5,10),(0,2,4),(0,0,1),(1,1,1)
		search2(17,0,arr.length-1);//(0,5,10),(6,8,10),(6,6,7),(7,7,7),(8,,7)fail
		search2(21,0,arr.length-1);//(0,5,10),(6,8,10),(9,9,10),(10,10,10)
	}
	static void search(int key){
		int start = 0, end = arr.length - 1, middle;
		while(start <= end) { //시작값과 끝값이 교차해 지나가면 키값을 못찾은 것
			middle = (start + end) / 2; //중간에 위치한 값
			if(arr[middle] == key) { //키값을 찾으면
				System.out.println("검색성공 "+middle+"번째자리");
				return;
			}
			else if(arr[middle] > key) { //키값보다 중간위치의 값이 크면 end을 중간값-1로
				end = middle - 1;
			}
			else { //키값보다 중간위치의 값이 작으면 start를 중간값+1로
				start = middle + 1;
			}
		}
		System.out.println("검색실패");
		return;
	}
	static void search2(int key, int start, int end) {
		int middle = (start + end) / 2;
		if(start > end) { //시작값이 끝값보다 커지게 되면 검색실패
			System.out.println("검색실패");
			return;
		}
		if(arr[middle] == key) { //키값을 찾으면
			System.out.println("검색성공 "+middle+"번째자리");
			return;
		}
		else if(arr[middle] > key) { //키값보다 중간위치의 값이 크면 end을 중간값-1로 바꾸어 재귀호출
			search2(key, start, middle - 1);
		}
		else { //키값보다 중간위치의 값이 작으면 start를 중간값+1로 바꾸어 재귀호출
			search2(key, middle + 1, end);
		}
	}
}
