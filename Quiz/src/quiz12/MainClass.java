package quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		Radio r = new Radio(); //300, sony
		Computer c = new Computer();
		Tv t = new Tv();
		
		
		//카트
		MyCart cart = new MyCart(10000);
		
		cart.buy(t);
		cart.buy(c);
		cart.buy(r);
		
		
		//cart.info();
		
		
		
	}
}
