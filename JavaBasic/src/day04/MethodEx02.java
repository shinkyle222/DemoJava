package day04;

public class MethodEx02 {

	public static void main(String[] args) {
		
	/*
	 * 매개변수(parameter)
	 * 메서드가 전달받는 매개값
	 * 여러 개 받을수도 있고, 받지 않을 수도 있다.	
	 */
		
	int result = calSum(10);
	System.out.println("결과:" + result);
		
	//호출할 때마다 매개변수를 다르게 줄 수 있다.
	int result2 = calSum(100);
	System.out.println("결과:" + result2);
	
	int result3 = calSum2(1, 2);
	System.out.println("결과:" + result3);
	
	String result4 = calSum3(5, "가");
	System.out.println("결과:" + result4);
	
	} //main
	
	//1부터 ~ 매개변수까지의 합계
	static int calSum(int a) {
		
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		
		return sum;
	}

	//매개변수 2개 받음
	static int calSum2(int a, int b) { //매개 변수가 2개 이상인 모형
//		int result = a + b;
//		return result;
		return a + b; //이렇게 적어도 result 값이 같게 나온다.  
	}
	
	//간단한 실습 - 정수, 문자열을 전달받는 calSum3() 생성이고 반환은 문자열
	static String calSum3(int a, String s) {
		
		String str = "";
		for(int i = 1; i <= a; i++) {
			str += s;
		}
		return str;
	}
}
