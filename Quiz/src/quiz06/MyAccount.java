package quiz06;

import java.util.Scanner;

import quiz_w2.Account;

public class MyAccount extends Account {
	/*
	   철수는 Account를 상속받는 나의계좌를 만드려고 한다.
	   기존에 가지고 있는 withDraw()기능이 마음에 들지 않았다.

	   Account를 상속받고
	   withDraw()를 오버라이딩하여 사용자의 입력(Scanner)를 통해 비밀번호가 일치하면
	   금액을 감소시키려고 한다.
	   또한 balance보다 큰 금액을 출금하려는 경우에는 "잔액부족" 을 출력해주어야한다.
	   withDraw() 메서드를 오버라이딩 해주세요.

	 */
	//생성자 이름은 클래스 이름과 똑같이 생성
	MyAccount(String pw, int bal){
	password = pw;
	balance = bal;
	}
	
	void withDraw(int a) {
		Scanner scan = new Scanner(System.in);
		String pw = scan.next();
		if(pw.equals(password)) {


			if(balance >= a) {
				balance -= a;
				System.out.println("잔액은:" + balance);
			} else {
				System.out.println("잔액부족:" + balance);
			}
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
}
