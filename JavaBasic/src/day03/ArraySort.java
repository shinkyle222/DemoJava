package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		//배열정렬 - 알고리즘이라 부른다.
		//		 - 정렬은 대략 6개
		//선택정렬 (모두의 경우의 수를 따져서 정렬)
		int[] arr = {5, 23, 1, 43, 200, 100, 40}; //작은 값을 Swap

		//1, 23, 5, 43, 200, 100, 40 - 1회전 후
		//1, 5, 23, 43, 200, 100, 40 - 2회전 후
		//1, 5, 23, 43, 200, 100, 40 - 3회전 후
		//1, 5, 23, 40, 200, 100, 43 - 4회전 후
		//1, 5, 23, 40, 43, 200, 100 - 5회전 후
		//1, 5, 23, 40, 43, 100, 200 - 6회전 후

		//바깥반복문은 회전수
		//안쪽반복문은 비교할값 ex) i=0일떄 i=1값은 1 i=2값은5 i=3값은 23 ....
		for (int i = 0; i < arr.length-1; i++) { //0~5까지

			for(int j = i+1; j < arr.length; j++) { //i+1~끝 / 끝까지 돌려면 length까지
				if(arr[i] > arr[j]) { //비교대상이 작다면, swap
					// 위에 꺽새만 반대로 바꾸면 내림차순으로 나온다.
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
