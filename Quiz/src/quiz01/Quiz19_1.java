package quiz01;

import java.util.Scanner;

public class Quiz19_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int okCount=0;
		int noCount=0;

		while (true) {
			int num1 = (int)(Math.random()*100) + 1;
			int num2 = (int)(Math.random()*100) + 1;
			int oper = (int)(Math.random()*2);

			System.out.println("-----------------------------");
			System.out.println(num1 + (oper == 0 ? " + " : " - ") + num2 + " = ?");
			System.out.println("문제를 그만 푸시려면 0을 입력하세요.");
			System.out.println(">");
			int answer = scan.nextInt();

			int correct = oper == 0? num1 + num2 : num1 - num2; //실제정답

			if(answer == 0) {
				System.out.println("정답횟수:" + okCount);
				System.out.println("오답횟수:" + noCount);
				break;
			}
			if(answer == correct) {//정답
				System.out.println("정답입니다");
				okCount++;
			} else { //오답
				System.out.println("틀렸는데요?");
				noCount++;
			}


		}
	}
}
