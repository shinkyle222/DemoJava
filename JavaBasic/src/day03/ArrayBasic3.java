package day03;

import java.util.Arrays;

public class ArrayBasic3 {

	public static void main(String[] args) {
		//배열은 크기가 고정 (고정된 크기만 가진다.)
		//크기가 100인 배열에 1~100까지 수를 저장.
		int[] arr = new int[100];
				
		for(int i = 0; i < arr.length; i++) { //0번째부터 length 미만이다.
			arr[i] = i+1; 
		}
		//배열 요소의 문자열 합
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i] + " "; //이 식은 문자열을 다해서 한번에 다 출력한다.
		}
		System.out.println(str);
	}
}
