package day13.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		//모든 기준은 1970년 1월 1일부터 시작
		
		Date date = new Date(); //날짜 뽑음
		System.out.println(date);
		
		//1970/1/1 0시 기준으로 밀리세컨으로 변경 => 날짜 연산
		long millis = date.getTime(); //날짜 연산을하며 밀리초로 계산 하는 방법
		System.out.println(millis);
		
		//현재시간 + 1초
		Date date2 = new Date(System.currentTimeMillis() + 1000 );
		System.out.println(date2);
		
		long millis2 = date2.getTime();
		System.out.println(millis2 - millis); //시간차
		
		System.out.println("-----------------------------------");
		
		//사람이 보기편한 날짜로 변환 (년 월 일 시:분:초)
		//요일은 E로 표현, 1년 중 몇번째 날의 몇번째는 D로 표현
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		
		String now = sdf.format(date);
		System.out.println(now);
		
	}
}
