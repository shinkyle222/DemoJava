package quiz_w2;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz05_1 {
    public static void main(String[] args) {
    	
    	/*
		2. 공백이 있는 문자열 2개를 입력 받고 오름차순으로 정렬된 배열을 출력하는 메소드를 만드세요.
		*/
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 문자열을 입력하세요: ");
        String str1 = scanner.nextLine();
        System.out.print("두 번째 문자열을 입력하세요: ");
        String str2 = scanner.nextLine();
        System.out.print("세 번째 문자열을 입력하세요: ");
        String str3 = scanner.nextLine();
        String[] sortedStrings = sortStrings(str1, str2, str3);
        System.out.println(Arrays.toString(sortedStrings));
    }

    private static String[] sortStrings(String str1, String str2, String str3) {
        String[] strings = {str1, str2, str3};
        Arrays.sort(strings);
        return strings;
    }
}

		
		
		
	
		
	