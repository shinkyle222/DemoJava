package day01;

public class DataType2 {

	public static void main(String[] args) {
		
		//단일문자를 저장하는 char = 2byte
		char c1 = 'A';
		char c2 = 65;
		
		//아스키코드 - 미국에서 문자들에 숫자값을 붙임 (1byte)
		//유니코드 - 전세계 문자에 숫자값을 붙임 (2byte - 부호없는 비트체계) 
		System.out.println(c1);
		System.out.println(c2);
		
		char c3 = '가'; //
		char c4 = 44032; //유니코드 10진수
		char c5 = '\uAC00';//유니코드
		
		System.out.println(c3 + "-" + c4 + "-" + c5);
		
		//문자열을 저장할 수 있는 String
		String s1 = "가가가가가 ";
		String s2 = "나나나나나";
		
		//문자를 붙일때 + 를 사용하면 됩니다.
		System.out.println(s1 + s2);
		
		//문자와 다른값에 + 연산 = 문자열
		System.out.println(100 + 100); //200
		System.out.println("100" + 100); //문자열에 다른값이 붙으면 문자열이 됩니다
		System.out.println(100 + 100 + "100");
		
		
		System.out.println("A" + 10); //A10
		System.out.println('A' + 10); //75 = char + int = int
		
		
		
	}
}
