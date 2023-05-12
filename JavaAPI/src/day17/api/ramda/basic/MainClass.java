package day17.api.ramda.basic;

public class MainClass {

	public static void main(String[] args) {

		//car의 run을 사용할 때 마다 매번 다른 기능으로 사용해야한다면..
		// => 익명클래스를 사용할 수 있습니다.
		/*
		Car car = new Car() {
			@Override
			public void run() {
				System.out.println("익명 객체로 생성된 Car");
				//내가 구현할 메서드를 사용하게끔 위에 형식이 나옴
			}
		};
		car.run(); //동작 명령

		Car car2 = new Car(){
			@Override
			public void run() {
				System.out.println("다른 내용의 익명 객체로 car 생성");

			}
		};
		 */

		//익명객체 표현 문법 => 람다 표현형식으로 사용이 가능
		Person p = new Person();
		p.greeting(new Say01() { //Say객체, 익명 객체로 그 자리에서 바로 만들어 사용

			@Override
			public void hello() { //함수명 hello
				System.out.println("헬로우 기능!");

			}
		}); 
		//함수명 생략가능
		//Say01이 가지고 있는 hello를 전달하는 모형
		p.greeting(() -> {System.out.println("람다 헬로우1");});
		//함수 안에 함수가 들어가 있는... 
		//1문법 - 사용할 문장이 1줄 이라면 {} 생략가능
		p.greeting(() -> System.out.println("람다 헬로우2"));

		/*
		p.greeting(new Say02() {
			@Override
			public String hello(String a, int b) {
				//프로그래머가 작성한 내용
				return a + b; //문자열로 반환
			}
		});
		 */

		//2문법 - 람다의 매개변수는 타입이 생략될 수 있다.
		//     - 프로그램 코드가 한줄이라면 return도 생략
		//p.greeting((String a, int b) ->{
		//
		p.greeting((a, b) -> a + b);
		//return a + b;	

		//greeting의 3번쨰 메서드에 전닫되는 값이 짝수 or 홀수인지 판별
		p.greeting((a) -> {

			boolean result = false;
			if(a % 2 == 0) {
				result = true;
			} else {
				result = false;
			}
			return result;
		});
		/* 삼항연산식도 사용 가능
		 * p.greeting((a) -> (a % 2 == 0 ? true : false);
		 */
	}
}
