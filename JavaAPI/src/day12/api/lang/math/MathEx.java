package day12.api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
		//Math은 클래스를 만들 수 없다.
		int r = (int) (Math.random() * 10) + 1; //1~10
		
		double d = Math.abs(-3.14); //절대값
		System.out.println(d);
		
		double d2 = Math.ceil(3.14); //올림
		System.out.println(d2);
		
		double d3 = Math.floor(3.14); //내림
		System.out.println(d3);
		
		double d4 = Math.round(3.5); //반올림
		System.out.println(d4);
		
		int d5 = Math.max(3, 5); //큰 수 반환
		System.out.println(d5);
		
		//Obj의 자식이기에 배열 숫자 부분에 래퍼클래스가 들어갈 수 있다.
		//Object[] arr = {래퍼클래스, 래퍼클래스, 래퍼클래스}
	
	}
}
