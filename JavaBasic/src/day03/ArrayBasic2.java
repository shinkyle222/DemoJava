package day03;

import java.util.Arrays;

public class ArrayBasic2 {

	public static void main(String[] args) {
		
		//배열의 순회
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; //길이가 10000
		/*
		int a = 0;
		while(a < arr.length) { //length 미만까지이니 < 하나로 처음부터 끝까지 접근 가능
			
			System.out.println("배열의" + a + "인덱스:" + arr[a]);
			
			a++;
			
		}
		*/
		
		//배열값들의 합
		int sum = 0;
		int i = 0;
		while(i < arr.length) {
			sum = sum + arr[i]; //sum += arr[i]
			
			i++;
		}
		System.out.println("배열요소의 합:" + sum);

	}
}
