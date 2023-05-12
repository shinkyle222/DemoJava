package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch2 {

	public static void main(String[] args) {
		
		//이진탐색 - 반을 분할하여 찾아가는 방법.
		//조건 - 순서대로 정렬
		/*
		 * 1. 포인터(start, end)를 처음과 끝에 2개를 배치
		 * 2. 중간값을 구함
		 * 3. 중간이 찾는 값인지 확인
		 * 4. 중간값이 찾는값보다 크다면, end를 중간값 -1로 내림
		 * 5. 중간값이 찾는 값보다 작다면, start를 중간값 +1로 올림
		 */
		int[] arr = {1, 3, 5, 10, 20, 30, 50, 80, 100}; //찾는 값이 없으면 서로 교차되는 값이 생긴다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("찾을 값>");
		int find = scan.nextInt();
		
		int start = 0;
		int end = arr.length-1; //8
		int count = 0; //회전수 확인
		
		while(start <= end) {
			count++;
			
			//중간값
			int mid = (start + end) / 2;
			
			if(arr[mid] == find) {
				System.out.println("회전수:" + count);
				System.out.println("찾을 값은:" + mid + "번째 존재함");
				break;
			} //else {
				//System.out.println("찾는 값이 없음"); 중간에 else 넣으면 절대 못찾으니 넣지 말 것 
			 
			//찾을 값이 중간값보다 큰 경우
			if(arr[mid] < find) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		//두 지점이 교차했다면, 찾는 값은 없음.	
		if(start > end) {
			System.out.println("찾는 값은 없습니다.");
		}
		//이진탐색 - 찾은 위치를 알려줌 (몇번째 인덱스에 있다 찾게 해주는 식)
		//찾을 값이 없으면 음수를 알려줌 ex) 배열에 101 없는데 밑에 101 넣고 돌리면 -10 결과 나옴
		System.out.println(Arrays.binarySearch(arr, 102));
		
	}
}
