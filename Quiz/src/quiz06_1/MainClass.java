package quiz06_1;

public class MainClass {

	public static void main(String[] args) {
		
		MyAccount acc = new MyAccount("123-456", "1234", 1000);
		
		
		acc.deposit(1000);
		acc.withDraw(500);
		
		System.out.println( acc.getBalance() );
	}
}
