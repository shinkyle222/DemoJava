package quiz09;

public class SuperSonicAp extends Airplane{//상속

	/*
	 * 1. Airplane을 상속받습니다. 생성자는 이름을 받아서 초기화 하도록 생성하세요
	 * 2. flyMode int형 변수를 선언하세요
	 * 3. fly() 메서드를 오버라딩합니다
	 * 	  fly() 메서드 안에서는 flyMode가 1이라면 "고속 모드로 비행합니다" 출력
	 *          flyMode 0이라면, super를 통해 부모님의 메서드를 호출
	 * 4. info() 메서드는 이름을 비행기의 이름, 속도를 리턴하도록 생성하세요.
	 */
	
	public int flyMode;
	SuperSonicAp(String a){ //멤버변수
		super(a); //생성자 이름을 받아서 초기지정 및 부모의 String name을 가져온다.
		
	}
	void fly(int flyMode) { //void fly이인 이유는 부모님껄 가져다가 내가 원하는 형태로 변경
		if(flyMode == 1) {
			System.out.println("고속 모드로 비행합니다.");
		} else if(flyMode == 0) {
			super.fly(); //부모님의 fly 메서드
		}
	}
	String info() {
		return "이름:" + name + ", 모드:" + flyMode;
	}
}






