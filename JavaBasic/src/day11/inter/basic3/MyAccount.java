package day11.inter.basic3;

public class MyAccount extends Account implements Calculator {

	private static final String bankName = "우리은행"; //객체들이 모두 동일한 값을 갖는다.
	
	public void method01() {
		System.out.println("오버라이드");
	}
	
	public void info(String name) {
		System.out.println("~~");
	}
	
	public void info(String name, String ssn) {
		System.out.println("~~~");
	}
	
	
	public static String getBankName() {
		return bankName;
	}

	@Override
	public void method02() {
		System.out.println("나만의 메서드2번~");
	}

	@Override
	public void add(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(int a) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
}
