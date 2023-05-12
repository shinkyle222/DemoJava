package day12.api.lang.string;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		//char에 문자열 받아서 string으로 변환 가능
//		char[] arr = {'a', 'b', 'c'}; 
//		String str = new String(arr);
		
		String str = "안녕하세요~";
		System.out.println(str);
		
		//한글자 자르기
		char c = str.charAt(0);
		System.out.println(c);
		
		//찾으면 인덱스 번호를 반환, 없다면 -1로 반환(즉, 못찾으면 음수값)
		System.out.println(str.indexOf("안녕"));
		System.out.println(str.indexOf("xx"));
		
		if(str.indexOf("안녕") != -1) {
			System.out.println("문자에 값이 존재함");
		}
		
		//문자열 끝에서부터 값을 찾음
		System.out.println(str.lastIndexOf("안녕"));
		
		//contains (있으면 true 없으면 false를 반환)
		if(str.contains("안녕")){
			System.out.println("문자에 값이 존재함");

		}
		
		//length(길이) - str 문자열 길이 출력
		System.out.println("문자열길이:" + str.length());
		
		System.out.println("--------------------------------");
		
		//문자열 변경 replace
		str = "자바의 기원은, 자바칩프라페치노 커피집에서 시작되었습니다.";
		
		//문자열까지 변경 가능 (타겟을 뒤에 있는 것으로 변경)
		//원본이 바뀌지 않고 여기서만 바꾸는 것,
		System.out.println(str.replace("자바", "java"));
		//통쨰로 바꾸려면 final 작업을 해야한다.
		
		//앞에만 바꿀 수 있다.
		System.err.println(str.replaceFirst("자바", "java"));
		
		//공백제거
		System.out.println(str.replace(" ", ""));
		
		System.out.println("--------------------------------");
		
		//문자열 자르기 substring
		System.out.println(str.substring(9)); //글자 9번째 미만 절삭
		System.out.println(str.substring(9, 17)); //글자 9이상 17미만 추출
		
		//배열 공백사이에 ,가 생긴다.
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		//최대 맥시멈 길이를 지정해준다.
		//배열 5개에서 3개로 줄임
		String[] arr2 = str.split(" ", 3); //최대 배열의 길이는 3
		System.out.println(Arrays.toString(arr2));
		
		//한글자씩 전부다 배열에 ,를 넣어준다.
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("--------------------------------");
		
		//문자열의 비교 (true or false로 결과 값 나온다.)
		str = "홍길동";
		System.out.println(str.equals("홍길동"));
		
		//사전 등재순의 비교
		System.out.println(str.compareTo("홍길동")); //0이 나오면 - 같은문자
		System.out.println(str.compareTo("홍길자")); //음수 - str이 홍길자 보다 사전 등재순 앞에 위치함		
		System.out.println(str.compareTo("홍길가")); //양수 - str이 홍길가 보다 사전 등재순 뒤에 위치함
		
		//String.join - 문자열을 특별한 구분자로 연결할때 사용한다. (Join의 반환은 String)
		//특정 구분자로 문자열을 연결
		System.out.println(String.join("-", "hello", "world", "!!!", "~~~"));
		
		//기본타입을 문자열로 변경
		System.out.println(String.valueOf(1) + String.valueOf(2));
		System.out.println("" + 1 + 2);
		
		

	}
}
