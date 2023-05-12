package day01;

public class Casting02 {

	public static void main(String[] args) {
		
		//크기가 큰타입을 작은 타입에 넣을 때는 (type) 캐스팅을
		//사용해서 명시적으로 변환해줍니다.
		int i = 70;
		char c = (char)i;
		short s = (short)i;
		
		System.out.println(c); //F
		System.out.println(s); //70	
		
		
		float f = 3.14F;
		int k = (int)f;
		System.out.println(k);
		
		//주의할점 - 타입변환시 값을 받을 수 없는 범위가 들어오면 잘려나간값(쓰레기)값을 저장합니다.
		int a = 1000;
		byte b = (byte)a;
		System.out.println(b); //-24
		
		//특이케이스 - 문자와 숫자간에도 명시적 형변환이 들어갑니다.
		char cc = 'A';
		short ss = (short)cc;
		
		
		
		
		
		
		
	}
}
