package quiz_w1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz03 {

	/*
	 * 문자열과 정수 (a,b) 2개를 입력 받고 , 문자열의 a 인덱스부터 b 인덱스까지 차례로 늘린 문자열을 출력해보세요
	1. 문자열을 입력 받습니다! (Scanner , 공백 없는 10자 이상)
	2. 0 이상 5 미만 정수 a와 5 이상 10 미만 정수 b / 총 2개의 정수를 입력 받습니다
    -> 조건이 맞지 않으면 “ 잘못 입력 했습니다 다시 입력해주세요”

	3. 문자열의 a번째 인덱스부터 증가가 시작 됩니다
	4. a가 만약 0 이라고 하면 0번째 인덱스 글자가 바로 2글자로 증가 됩니다
	5. 그렇게 b번째 인덱스까지만 증가해주고 문자열을 마무리 해주시면 됩니다
	tip. 저는 while문, if문, for문, 문자열 다루기를 활용한 String 배열 등의 문법을 활용했습니다!

	입력과 출력 예시를 캡쳐 해서 올려뒀습니다! 초록색 글씨 입력 / 검정색 글씨 출력
	1. 0 이상 5 미만 정수 a와 5 이상 10 미만 정수 b / 총 2개의 정수를 입력 받습니다
	-> 조건이 맞지 않으면 “ 잘못 입력 했습니다 다시 입력해주세요”
	2. 문자열의 a번째 인덱스부터 증가가 시작 됩니다
	3. a가 만약 0 이라고 하면 0번째 인덱스 글자가 바로 2글자로 증가 됩니다
	4. 그렇게 b번째 인덱스까지만 증가해주고 문자열을 마무리 해주시면 됩니다

	tip. 저는 while문, if문, for문, 문자열 다루기를 활용한 String 배열 등의 문법을 활용했습니다!
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("공백 없는 10자 이상 문자열을 입력하시오 > ");
		String str = scan.next();
		int a = 0;
		int b = 0;

		while(true) {

			System.out.println("0 이상 5 미만 정수를 입력하시오 > ");
			int i = scan.nextInt();
			if(i >= 5) {
				System.out.println("잘못 입력 헀습니다. 다시 입력해주세요");
			}
			else if(i < 5 && i >= 0) {
				a = i;
				break;
			}
		}
		while(true) {

			System.out.println("5 이상 10 미만 정수를 입력하시오 > ");
			int i = scan.nextInt();
			if(i < 5 || i >= 10) {
				System.out.println("잘못 입력 헀습니다. 다시 입력해주세요");
			}
			else if(i >= 5 && i < 10) {
				b = i;
				break;
			}
		}

		System.out.println("입력한 정수 : "+ a +", "+ b);

		String[] s = str.split("");
		System.out.println(a + "번째 인덱스 ->" + s[a] + " 부터," + b + "번째 인덱스 ->" + s[b] + "까지 늘어납니다!");
		str = "";
		for (int i = 0; i < s.length; i++) {
			if(i >= a && i <= b) {
				for (int j = 1; j < i; j++) {
					str = str + s[i];
				}
			} else str += s[i];
		}
		System.out.println(str);
	}
}
