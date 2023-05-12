package quiz01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("정수1>");
		int n1 = scan.nextInt();
		
		System.out.print("연산을 선택하세요[+, -, *, /]>");
		String oper = scan.next();
		
		System.out.print("정수2>");
		int n2 = scan.nextInt();
		
		switch (oper) {
		case "+":
			//문자열로 출력이 될 수 있으니, 정수의 합이 먼저 진행되기위해 소가로를 한번 더 쓴다.
			System.out.println("두 수의 합은:" + (n1 + n2) );
			break;
		case "-":
			System.out.println("두 수의 차는:" + (n1 - n2) );
			break;
		case "*":
			System.out.println("두 수의 곱은:" + (n1 * n2) );
			break;
		case "/":
			System.out.println("두 수의 나눗셈:" + (n1 / n2) );
			break;
		default:
			System.out.println("연산자는[+, -, *, /]입니다");
			break;
		}
		
		
		
		
		
		
		
		
	}
}
