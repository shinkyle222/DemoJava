package day05;

public class ObjectBasic02 {

	public static void main(String[] args) {
							//객체
		Calculator cal1 = new Calculator();
		
		System.out.println("====1번 계산기====");
		System.out.println(cal1.add(10));
		System.out.println(cal1.add(20));
		System.out.println(cal1.add(30));
		
		Calculator cal2 = new Calculator();
		System.out.println("====2번 계산기====");
		System.out.println(cal2.add(100));
		System.out.println(cal2.add(200));
		System.out.println(cal2.add(300));
		
	}
}
