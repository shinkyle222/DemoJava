package quiz02;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = new Account("123-456", "1234", 1000);
		
		acc.deposit(-5000); //입금
		
		acc.withDraw(10000); //출금
		
		//int num = scan.nextInt(); <- 이거와 아래와 다른지 생각해볼 것
		int balance = acc.getBalance(); //잔고확인
		System.out.println(balance);
		
	}
}
