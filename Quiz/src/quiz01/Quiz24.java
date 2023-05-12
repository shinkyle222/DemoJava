package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {

		/*
		 * 1. 1~9까지 숫자중 절대 중복되지 않는 숫자 3개를 추출.
		 * 	  Math.random()을 사용하여,
		 * 	  arr를 랜덤하게 10번 섞어줍니다.
		 *    0~2번째 값을 새로운 배열로 옮겨 담아보세요.
		 */

		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[3];
		int temp = 0; //앞의 숫자와 뒤의 숫자의 크기를 비교해 순서를 바꿔주기 위해서 사용
		for (int i=0; i < 10; i++) {
			int a = (int)(Math.random()*9);
			int b = (int)(Math.random()*9);

			temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(arr[0]+ " " + arr[1] + " " + arr[2] + " ");
	} 
}