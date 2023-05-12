package day03;

public class Test {

	public static void main(String[] args) {
		
//		int a = 1;
//		a = a + 1;
//		System.out.println(a);
		
//		int a = 3;
//		a += 3; //
//		System.out.println(a);
		
		double d = Math.random() * 10;
		int a = (int)d + 1;
		System.out.println(a);
		
		int result = (int)(Math.random() * 10) + 1 ;
		
		//삼항연산식
		//조건 ? 연산1 : 연산2
		String s = result % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result + "는" + s);
		 
	}
}
