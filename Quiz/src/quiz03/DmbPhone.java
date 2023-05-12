package quiz03;

public class DmbPhone extends Phone {
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
	int channel;
	
	DmbPhone(){ // <- 기본생성자
	}
	DmbPhone(String a, String b, int c){
		model = a;
		color = b;
		channel = c;
	}
	void turnOnDmb() {
		System.out.println("TV를 켭니다.");
	}
	void changeChannel(int c) { //c도 되고 channel로도 변경 가능하다.
		channel = c; //채널을 10번에서 7번으로 변경
		System.out.println(channel + "번 변경");
	}
	void turnOffDmb() {
		System.out.println("TV를 끕니다.");
	}
	void powerOff() {
		System.out.println();
	}
}