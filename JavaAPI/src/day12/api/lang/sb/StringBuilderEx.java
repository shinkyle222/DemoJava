package day12.api.lang.sb;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		//StringBuilder - 단일 쓰레드 환경에서
		//StringBuffer = 멀티 쓰레드 환경에서 사용
		
		String str = new String("Java ");
		StringBuilder sb = new StringBuilder("Java ");
		
		//차이점
		str = str + "program"; //치환해서 새롭게 만들어 Java program
		sb.append("program"); //Java에 program 붙인형태
		
		System.out.println(str);
		System.out.println(sb);
		
		//빌더의 메서드
		//append() - 문자열 끝에 추가
		sb.append("ming");
		System.out.println(sb);
		
		//insert() - 중간에 추가
		//offset - 시작지점
		sb.insert(5, "study ");
		System.out.println(sb);
		
		//replace() - 문자열 변경
		sb.replace(5, 10, "book");
		System.out.println(sb);
		
		//delete() - 삭제
		//공백 포함 중간부분만도 삭제 가능
		sb.delete(5, 10); //이상~미만
		System.out.println(sb);
		
		sb.deleteCharAt(0); //인덱스번째 삭제
		//함수 실행만하면 객체가 바로 변경된다.
		System.out.println(sb);
		
		//reverse() - 거꾸로
		sb.reverse();
		System.out.println(sb);
		
		//toString() - 문자열로 형변환
		String result = sb.toString();
		System.out.println(result);
		
		
	}
}
