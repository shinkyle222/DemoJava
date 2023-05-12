package day04;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		//문자열 다루기
		//문자열은 사실 배열입니다. 문자열은 인덱스가 있습니다.
		
		String str = "안녕하세요~ 영어로하면 하이!";
		//System.out.println(str[0]); //안돼!
		
		//문자열을 다루는 다양한 메서드를 제공
		
		//str.charAt(0); -> 매개변수가 정수가 들어간다는 뜻
		               //-> 매서드 뒤에 콜론이 들어간다는 것은 반환이라는 뜻
		
		//문자열 한글자 자를때 charAt을 사용해야한다.
		char c = str.charAt(5);
		System.out.println(c);
		
		//문자열에 앞에서부터 위치확인 index of, lastIndexOf - 없다면 -1을 반환
		int idx = str.indexOf("야");
		System.out.println("문자의 위치:" + idx);
		
		//문자열에 뒤에서부터 위치확인 (뛰어쓰기도 카운트 된다.)
		int idx2 = str.lastIndexOf("하");
		System.out.println("뒤에서부터 찾은위치:" + idx2);
		
		//문자열 변환 toUpperCase(), toLowerCase
		String s = "abcDEF";
		
		String result = s.toLowerCase();
		System.out.println(result); //소문자로
		System.out.println(s); //❤원본문자열은 그대로 유지❤ -> 이모티콘 윈도우 + 세미콜론❤
	
		String result1 = s.toUpperCase();
		System.out.println(result1); //대문자로
		
		System.out.println("=============================");
		//문자열 변경 replace
		
		s = "abcdefaaa";
		
		String result3 = s.replace("a", "x");
		System.out.println(result3); //a -> x로 변경, (전부다)
		System.out.println(s); //❤본문자열은 그대로 유지❤
	
		String result4 = s.replaceFirst("a", "x");
		System.out.println(result4); //a -> x로 변경, (첫번째만)
		
		System.out.println("=============================");
		//공백제거 trim
		str = "010-1111-2222";
		
//		str.trim();
//		System.out.println(str);
		
		String result5 = str.trim(); //앞뒤 공백을 제거해서 반환
		System.out.println(result5);
		
		str = "안녕 하세요? 오늘은 4월 19일 입니다.";
		str = str.replace(" ", ""); //공백을 전부제거해서 원본문자열에 저장
		System.out.println(str);
		
		System.out.println("=============================");
		//문자열 자르기
		
		//특정 위치에서 자르기 substring - 인덱스 기준으로 자름
		str = "010-1111-2222";
		String result6 = str.substring(9); //인덱스 번째 미만 절삭
		System.out.println(result6);
		
		//str의 원본문자는 변함 없음
		String result7 = str.substring(4, 8); 
		// 4 <= x < 8 인덱스 추출 (4번째 이후부터 8번째 미만까지)
		
		System.out.println(result7);
		
		System.out.println(str); //원본은 변함없음
		
		//좋은기능 split - 특정문자를 기준으로 자름 (제대로 사용하려면 정규표현식)
		
		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str.split("");
		System.out.println(Arrays.toString(arr2));
		
		//to.CharArray - 한글자씩 char혀으로 자름
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("=============================");
		//문자열의 길이
		str = "안녕하세요.";
		int len = str.length(); //문자열의 길이
		System.out.println("문자열길이:" + len);
		
		//문자열의 비교 equals() **무조건 외워야 함**
		if(str.equals("안녕하세요.")) {
			System.out.println("두 문자가 같음");
		}
		
		//문자열의 포함여부 contains()
		if(str.contains("녕")) {
			System.out.println("녕이 포함되어 있음");
		}
	}
}
