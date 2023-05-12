package quiz09;

public class MainClass {

	public static void main(String[] args) {
		SuperSonicAp ap = new SuperSonicAp("종이비행기"); //자식클래스 생성

		ap.takeOff();
		ap.fly(); //오버라이딩
		ap.flyMode = 1;
		ap.fly();
		ap.land(); //상속받은 메서드인 land or takeOff를 사용가능하다.
	}
}
