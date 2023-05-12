package quiz_w2;

import java.util.Calendar;
import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
    	
		/*
		1. 2023년도의 월과 일을 입력했는때 요일을 출력하는 메소드를 만드세요.
		(Date클래스는 사용하지 않습니다.)
		*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요(yyyy): ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요(mm): ");
        int month = scanner.nextInt();
        System.out.print("일을 입력하세요(dd): ");
        int day = scanner.nextInt();
        String weekday = getWeekday(year, month, day);
        System.out.println("해당 날짜의 요일은 " + weekday + "요일입니다.");
    }

    private static String getWeekday(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int weekdayIndex = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        String[] weekdays = {"일", "월", "화", "수", "목", "금", "토"};
        return weekdays[weekdayIndex];
    }
}
