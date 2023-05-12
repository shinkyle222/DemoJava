package day13.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		//Calendar cal = new Calendar();
		
		//static메서드를 사용해서 객체를 반환하는 모형
		Calendar cal = Calendar.getInstance(); //getInstance는 객체를 반환하여 cal에 넣는다.
		
//		int year = cal.get(1); //get 함수에 1을 넣어 현재년도를 알 수 있다.
//		System.out.println(year);
		
		System.out.println(Calendar.YEAR); //1
		System.out.println(Calendar.MONTH); //2
		System.out.println(Calendar.DATE); //5
		
		int year = cal.get(Calendar.YEAR); //Calendar.Year도 현재년도 표현
		System.out.println(year); //년
		
		int month = cal.get(Calendar.MONTH); 
		//Month는 만들때 한달 적게 나온다. 그 이유는 구글...
		//그러기에 항상 +1 넣을 것
		System.out.println(month + 1); //월 = 1작게 나옴
		
		int day = cal.get(Calendar.DATE);
		System.out.println(day); //일
		
		int hour = cal.get(Calendar.HOUR); //시
		int min = cal.get(Calendar.MINUTE); //분
		int second = cal.get(Calendar.SECOND); //초
		
	}
}
