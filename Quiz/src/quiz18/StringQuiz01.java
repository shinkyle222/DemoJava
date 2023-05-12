package quiz18;

import java.util.Scanner;

public class StringQuiz01 {

	/*
	 * 스캐너를 사용해서 id를 입력받습니다.
	 * 아이디는 공백을 포함해서 받을 수 있습니다. nextLine()
	 * 
	 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받습니다.
	 *	   5글자 이상이라면 "id가 등록되었습니다" 출력 후 종료
	 */

	public static void main(String[] args) {

		while(true){
			
			System.out.println("사용할 ID를 입력하세요>");
			
			Scanner scan = new Scanner(System.in);
			String id = scan.nextLine();
			//String id = str.replace(" ", "");
			//if문 안에 id.length() 이렇게 넣어도 문제 풀이 가능
			
			if(id.replace(" ", "").length() < 5) {
				System.out.println("아이디는 5글자 이상이어야 합니다.");
			} else { 
				System.out.println("ID>" + " " + id + "가 등록되었습니다.");
				break;
			}
		}
	}
}
