package quiz18;

import java.util.Scanner;

public class StringQuiz03 {

	public static void main(String[] args) {

		//회문비교 -> "다시 합창 합시다"
		/*
	      1. String palindrome(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
	      2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
	      3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
	         //위에 3개 문장은 회문, 앞으로 읽나 뒤로 읽나 같다.

	      4. 문장은 공백을 포함하여 받을 수 있습니다.
	      5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
	         조건 - 빌더의 reverse() 는 금지 입니다.

	      6. 힌트)
		 * 공백은 없어져야 비교가 됩니다. 
		 * 회문은 첫글자와, 마지막글자 가 똑같습니다.
		 * 
		 * abccba / to point 알고리즘 양방향에서 읽어서 값을 본다. 
		 * 왼쪽에서 a부터 우측도 a부터 읽는다는 뜻
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int flag = 0;
		char[] arr = new char [100];
		arr = a.toCharArray();
		for(int i = 0; i < a.length()/2; i++) {
			if(arr[i] != arr[a.length()-i-1])
				flag = 1;
		}
		if(flag == 0)
			System.out.print("회문입니다.");
		else
			System.out.print("회문이 아닙니다.");
	}
}
