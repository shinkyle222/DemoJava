package day12.api.lang.wrapper;

public class BoxingEx {

	public static void main(String[] args) {
		
		int a = 100;
		double b = 3.14;
		char c = 'A';
		boolean d = false;
		
		//boxing: 기본타입을 => 클래스형으로 변환
		Integer v1 = new Integer(a); //replicated
		Double v2 = new Double(b);
		Character v3 = new Character(c);
		Boolean v4 = new Boolean(d);

		//숫자 저장 타입 순위별 int > number > obj (최종)
		Object[] arr = {v1, v2, v3, v4};
		
		//unboxing : 클래스형 => 기본형으로 변환
		int result = v1.intValue();
		double result2 = v2.doubleValue();
		char result3 = v3.charValue();
		boolean result4 = v4.booleanValue();
	}
}
