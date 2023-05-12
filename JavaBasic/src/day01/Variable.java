package day01;

public class Variable {

	public static void main(String[] args) {
		
		/*
		 * 변수의 선언방법
		 * <데이터타입> 이름;
		 * 
		 * int는 Integer의 약자로 정수를 저장하는 타입
		 */
		
		int num; //선언
		num = 10; //초기화
		
		System.out.println(num);
		
		//선언과 초기화를 동시에
		int num2 = 20;
		
		//같은 이름으로 변수를 생성할 수 없음
//		int num2 = 30;
		
		//언제든지 값을 바꿀 수 있음
		num2 = 40;
		System.out.println(num2); //40
		num2 = 50;
		System.out.println(num2); //50
		
		//변수에는 다른 변수의 값, 또는 연산한 결과도 저장할 수 있습니다.
		int result = num + num2;
		
		//문자열을 저장 - String에 저장합니다.
		String s = "홍길동";
		
		//?
		int result2 = num + 20;
		result2 = 100;
		result2 = 10 + result2;
		
		//result2 ??? - 110
		
		
		
		
		
		
		
		
		
		
	}
}
