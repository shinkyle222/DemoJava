package day17.api.ramda.basic;

public class Person {

	//일반클래스 - 고차함수를 가지고 있는 클래스
	//함수적 인터페이스
	public void greeting(Say01 say01) { //map(Function)이 들어갔다 생각하면 됨 
		say01.hello(); //대신실행 (이미 만들어져 있음)
	}
	
	public void greeting(Say02 say02) { //distinct()
		String result = say02.hello("greeting이 전달한 문자열", 1);
		System.out.println("greeting return:" + result);
	}
	
	public void greeting(Say03 say03) { //sort()
		boolean result = say03.bye(3);
		System.out.println(result);
	}
}
