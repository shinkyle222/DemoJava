package quiz17;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception {
		/*
		 * 1. 스캐너로 정수 2개를 입력을 받아서 두 수의 합을 반환하는 기능
		 * 2. 입력된 값이 정수라면 합계를 반환.
		 * 3. 예외가 발생하면, 직접예외를 생성하고 예외 메시지를 외부로 전달하면 됩니다.
		 * 4. scan.close() 은 finally에서 처리하세요.
		 * 
		 */
		Scanner scan =  new Scanner(System.in);
		try {
			//예외가 발생하면 가장 가까운 catch문으로 이동됩니다.
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			return num1 + num2;
			
		} catch (Exception e) {
			throw new Exception("문자를 입력하세요"); //예외생성
		} finally {
			scan.close();
		}
		
	}
}
