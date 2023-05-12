package day01;

public class Casting01 {

	public static void main(String[] args) {
		
		//작은 타입을 큰타입에 넣을때는 자동형변환이 일어납니다.
		byte a = 10;
				
		short s = a; //byte -> short 자동형변환
		int i = a; 	 //byte -> int 자동형변환
		long l = a;	 //byte -> long자동형변환
		
		//문자와 숫자간에도 유효함 
		char c = '가'; 
		int j = c; //char -> int 형변환
		System.out.println(j);
		
		int k = 1000;
		double d = k; //int -> double 형변환
		System.out.println(d);
		
		//데이터타입 크기 -> byte < short < int < long < float < double
		//ex) double을 int에 넣으려면 타입 캐스팅을 해야한다.
		double x = 3.14;
		int y = (int)x;
		
		System.out.println(Math.random());
		//더블형 랜덤값을 뽑아주는 식
		int random = (int)Math.random() * 100 + 1;
		
		
	}
}
