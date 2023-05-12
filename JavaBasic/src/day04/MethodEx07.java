package day04;

public class MethodEx07 {

	public static void main(String[] args) {
		//메서드의 연쇄호출 (동기적 방식) - 순서대로 처리
		//메서드안에서는 메서드를 호출이 가능함
		//test01();
		
		//메서드의 재귀 (나 자신을 계속 호출하는 함수이며, 이 문법 안써도 문제가 될 건 없다.)
		recursive(1);
		
		System.out.println(fac(5));
	}
	
	static void test01() {
		System.out.println("1번 메서드 실행");
		test02(); //이 메서드 끝날때까지 1번 메서드 종료는 맨 마지막에 실행된다.
		System.out.println("1번 메서드 종료");
	}
	
	static void test02() {
		System.out.println("2번 메서드 실행");

		System.out.println("2번 메서드 종료");
	}

	static void recursive(int a) {
		//함수의 재귀는 반드시 탈출의 조건이 있어야 합니다. 그러지 않을경우 실행 불가
		if(a == 10) {
			return; //함수의 종료
		}
		System.out.println(a + "호출");
		
		a++;
		recursive(a);
	}

	static int fac(int a) {
		
		if(a == 1) {
			return 1;
		}
		return a * fac(a-1);
	}
}

