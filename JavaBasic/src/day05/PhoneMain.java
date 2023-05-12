package day05;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone black = new Phone(); //생성자를 부르는 작업 new + 생성자 이름
									//생성자를 호출하면서 객체를 만든다.
		black.info();
		
		Phone pink = new Phone("아이폰14"); //String a 이기에 아이폰 문자열로 넣어 출력
		pink.info();
		
		Phone red = new Phone("TTL", "빨강");
		red.info();
		
		Phone white = new Phone("가로본능", 400000);
		white.info();
		
		//model, color, price를 매개변수로 받아서 초기화하는 생성자를 만들어보세요.
		//객체생성도 해보세요.
		
		Phone blue = new Phone("갤럭시 노트", "블루", 500000);
		blue.info();
	}
}
