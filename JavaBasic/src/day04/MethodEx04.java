package day04;

import java.util.Arrays;

public class MethodEx04 {

	public static void main(String[] args) {

		//배열을 매개변수로 전달 할 수 있을까요? Yes
		char[] arr = {'a','b','c','d','e'};

		method01(arr); //변수명으로 주면됩니다.

		//배열을 반환유형으로 전달 받을 수 있습니다. (사용하고 싶으면 타입 변수명을 그대로 사용해서 넣는다.)
		int[] result = method02();
		System.out.println(Arrays.toString(result));
	}

	static void method01(char[] arr) { // char[] arr <- character은 이런 방법으로 넣는다.
	}
	static int[] method02() {

		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;


		return arr;
	}
}
