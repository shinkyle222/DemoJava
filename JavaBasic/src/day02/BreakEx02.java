package day02;

import java.util.Scanner;

public class BreakEx02 {
	public static void main(String[] args) {
		//입력을 여러 개 받아본다.
		Scanner scan = new Scanner(System.in); //반복문 안에 넣으면 계속 생성된다. 그러기에 밖에 빼놓는다.

		while(true) {

			System.out.println("4 X 3 = ?");
			System.out.print("정답>");
			int answer = scan.nextInt();

			if(answer == 12) { //정답
				System.out.println("정답!");
				break;
			} else {
				System.out.println("오답인데요?");
			}
		}
	}
}