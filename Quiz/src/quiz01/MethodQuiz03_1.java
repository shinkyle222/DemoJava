package quiz01;

import java.util.Arrays;

public class MethodQuiz03_1 {

	public static void main(String[] args) {
		
		char[] arr = {'a','b','c','d','e'};
		String result = method06(arr);
		System.out.println(result);
		
		int[] arr2 = {1,2,3,4,5};
		int result2 = (method07(arr2));
		System.out.println(result2);
		
		String[] arr3 = method08("가나다라마바사", "아자차카타파하");
		System.out.println(Arrays.toString(arr3));
		
	} //main
	
	static String method06(char[] arr) {
		String str = "";
		for(int i = 0; i <= arr.length-1; i++) {
			str += arr[i];
		}
		return str;
	}
	
	static int method07(int[] arr) { //향상된 포문을 사용해보자.
		int sum = 0;
		for(int a : arr) {
			sum += a;
		}
		return 0;
	}
	
	static String[] method08(String a, String b) {
		
		String[] arr = {a, b};
		return arr;
//		return new String[] {a, b};
		
		
	}
}
