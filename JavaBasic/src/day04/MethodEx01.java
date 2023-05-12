package day04;

public class MethodEx01 {

	public static void main(String[] args) {

		/*
		 * 메서드는 생성과 호출이 있습니다.
		 * 메서드는 메서드안에서 생성 할 수 없습니다. (메인 메서드 밖이면 위든 아래든 만들 수 있다.) 
		 * 허나 C나 파이썬은 맨 위에서 선언해야하나, 자바는 클래스 어디서든 상관없다.)
		 */

		//1~10부터 합까지 구하는 반복문
		//		int sum = 0;
		//		for(int i = 1; i <= 10; i++) {
		//			sum += i;


		//메서드는 재사용이 가능
		//		System.out.println("1~10까지의 합:" + calSum());
		//		System.out.println("1~10까지의 합:" + calSum());
		//		System.out.println("1~10까지의 합:" + calSum());
		//		
		int result = calSum();
		System.out.println("1~10까지의 합:" + result);

//		String result2 = calSum2();
//		System.out.println(result2);

	} //main

	//반환유형 이름()
	static int calSum() {
		//		여기에서 배운 문법들을 모두 쓸 수 있다. (ex: 스캐너, 배열 등등등)
		//		1~10까지 합
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum; //합계를 반환
	}

	//문자열 반환
	static String calSum2() {

		//A~Z문자열합
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}

		return str; //문자열 반환
	}
}
