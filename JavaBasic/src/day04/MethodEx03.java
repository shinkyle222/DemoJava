package day04;

public class MethodEx03 {

	public static void main(String[] args) {
		
//		return;
		
		/*
		 * return이란
		 * 1. 메서드에서 리턴은 실행결과를 돌려주는 값에 대한 타입
		 * 2. 리턴이 있는 메서드는 다른 메서드의 매개값으로도 사용이 됩니다.
		 * () 소괄호가 있다면 무조건 메서드다.
		 * 3. 리턴은 반환값이 없을 수도 있으며, void로 선언합니다.
		 * 4. void메서드도 return을 사용할 수 있습니다.
		 * 		- 대신 값을 돌려주지는 못하고, 종료의 의미
		 *  
		 *  void형 메서드에서 사용되는 return은 메서드의 종료를 의미한다.
		 *  반환 유형이 있는 메서드에서는 단순 return은 사용할 수 없다
		 *  
		 */
		
		System.out.println(add(1, 2));
		
		int result = add( add (1, 2), add (3, 5));
		System.out.println("결과:" + result);
		
		//void형 메서드는 return이 없기 때문에 단순히 호출만 가능합니다.
		//System.out.println(sub()); 에러!
		sub();
		div(6, 2);
		
		noReturn("bye");
		noReturn("hello");
		
	} //main
	
	static int add(int a, int b) {
		return a + b;
	}

	//반환이 없고, 매개변수도 없는 모형
	static void sub() { // 무언가로 돌아(return)가는게 아니라 단순히 실행(호출)만 한다.
		System.out.println("5 - 3 = 2");
	}
	
	//반환이 없고, 매개변수는 있는 모형
	static void div(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a/b));
	}
	
	//
	static void noReturn(String s) {
		//if(s == "hello") { //문자열 비교는 ==로 하면 안된다. 원하는 겂이 안나옴
		if(s.equals("hello")) {
			System.out.println("메서드를 종료합니다.");
			return;
		}
		System.out.println("hello를 전달해야 할껄요?");
	}
}
