package quiz02;

public class Account {
	//한 사람의 은행 계좌
	/*
	 * accountNumber 변수 - 식별아이디
	 * password변수 - 비밀번호
	 * balance변수 - 잔고
	 * 
	 * 생성자
	 * 매개변수를 3가지를 모두 받아서 초기화하는 생성자
	 * 
	 * 메서드
	 * deposit : void - 잔고에 매개변수를 누적하는 기능
	 * withDraw : void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance : int - 잔고를 리턴하는 기능
	 * 
	 * 메인 클래스에서는 각각의 기능을 확인
	 * 
	 */
	
	String accountNumber;
	String password; //password는 문자열 또는 숫자로 해도 된다.
	int balance;
	
	//생성자
	Account(String num, String pw, int bal){ //()가로 안에 있는게 매개변수 (외부에서 전달되기에 받은 값을 초기화한다.)
		accountNumber = num;
		password = pw;
		balance = bal;
	}
	
	void deposit(int money) {
		//매개변수가 양수 일때만 가능하도록 변경
		if(money > 0) { 
			balance += money; 
		} else {
			System.out.println("입금이 0보다 작을수는 없습니다.");	
		}
	}
	void withDraw(int money) {
		//매개변수가 잔고보다 작을때만 출금이 가능하도록 변경
		if(money <= balance) {
			balance -= money;			
		} else {
			System.out.println("잔고가 부족합니다.(잔고:" + balance + ")");
		}
	}
	int getBalance() {
		return balance; //멤버변수
	}
}
