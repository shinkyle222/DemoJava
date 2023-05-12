package quiz01;

import java.util.Scanner;

public class Quiz26 {

	public static void main(String[] args) {

		//백준 문자와 문자열 - https://www.acmicpc.net/step/7
		//1번
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		int a = scan.nextInt();

		System.out.println(str.charAt(a-1));

		//char c = str.charAt(a-1);
		//System.out.println(c);

		System.out.println("=============================");
		//2번
		str = "pulljima";
		int len = str.length(); //문자열의 길이
		System.out.println("문자열길이:" + len);

		System.out.println("=============================");
		//3번
		//테스트 케이스의 개수 선언
		int b = scan.nextInt();

		String[] arr = new String[b];
		 
		//문자열 입력받기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.next();
		} scan.close();
		// 입력받은 문자열을substring으로 0번째 끝번째를 출력한다.
		for(int i = 0; i < arr.length; i++) {
			 
			//만약 입력받은 문자열의 길이가 1자리면 앞 뒤 둘 다 출력
			if (arr[i].length() < 1) {
				System.out.println(arr[i] + "" + arr[i]);
			} else {
				System.out.print(arr[i].substring(0, 1)); // 0번째 1번째 출력
				System.out.println((arr[i].substring(arr[i].length() - 1, arr[i].length())));// 끝에서 -1번째부터 끝번째까지
			}
		}
	}
}