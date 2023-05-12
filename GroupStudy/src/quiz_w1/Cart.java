package quiz_w1;

public class Cart {

//	String[] cart; //멤버변수에 변수를 선언 가능
	String[] cart = new String[1]; // <- 초기값까지 준 상태
	int money; //금액
	int i = 0; //cart의 순서
	
	int tv;
	int com;
	int radio;
	
	void buy(String product) {
		System.out.println("재정의 하세요");
	}
	
	void add(String product) {
		System.out.println("재정의 하세요");
	}
	
	void info() {
		System.out.println("재정의 하세요");
	}
}
