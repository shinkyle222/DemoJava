package quiz01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodQuiz03 {

	public static void main(String[] args) {
		
	//method 6 - char배열의 요소를 문자열로 모두 붙여서 리턴" / string, char[]
	//method 7 - 배열의 요소의 합을 리턴 / int, int[]
	//method 8 - 매개 변수를 배열에 저장하여 배열 리턴 / string[], string,string

	//int[] arr = {1, 2, 3, 4, 5};
	//배열을 반환유형으로 전달 받을 수 있습니다. (사용하고 싶으면 타입 변수명을 그대로 사용해서 넣는다.)
	
	char[] x = {'a','b','c','d','e'};
	System.out.println(method06(x));
	
	int[] y = {1,2,3,4,5};
	System.out.println(method07(y));
	
	System.out.println(Arrays.toString(method08("가나다라마바사", "아자차카타파하")));
	
	}
	static String method06(char[] c) {
		String str = "";
		for(int i = 0; i <= c.length-1; i++) {
			str += c[i];
		}
		return str;
	}	
	static int method07(int[] a) {
		int sum = 0;
		for(int i = 0; i <= a.length-1; i++) {
			sum += a[i];
		}
		return sum;
	}	
	static String[] method08(String a, String b) {
		String[] str = new String[2];
		
		str[0] = a;
		str[1] = b;
		
		return str;
	}
}