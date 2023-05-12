package quiz01;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		//오후에..
		//+- = ?
		//Exit 0번
		//틀렸어요.

		Scanner scan = new Scanner(System.in);

		//		int num3 =
		String[] op = new String[2];
		op[0] = "+";
		op[1] = "-";

		int count1 = 0; 
		int count2 = 0;

		while(true) {
			int num1 = (int)(Math.random()*100) +1;
			int num2 = (int)(Math.random()*100) +1;

			System.out.println("----------------------------");
			System.out.println(num1 + "+" + num2 + " = ?");
			
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			int answer1=scan.nextInt();
			if (answer1 == 0) {
				System.out.println("프로그램 정상 종료");
				break;
			}
			else if (answer1 == num1 + num2) {
				count1++;
				System.out.println("정답입니다.");
				System.out.println("정답:" + count1);
				
			} else if (answer1 != num1 + num2) {
				count2++;
				System.out.println("틀렸는데요?");
				System.out.println("오답:" + count2);
				
			}			
		}
	
	
	
	
	
	
	
	
	
	
	}
}