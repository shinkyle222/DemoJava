package quiz16;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * updown게임
		 * 
		 * 
		 * 에러가 발생하면 시도횟수는 증가하고 다시 입력받을 수 있도록 코드를 변경 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random() * 100) + 1; 
		
		int count = 0; //시도횟수
		
		while(true) {
			
			try {
				
				System.out.print("정답입력>");
				int answer = scan.nextInt();
				//시도횟수 증가
				count++;
				if(num == answer) { //정답
					System.out.println("정답!");
					System.out.println("시도횟수:" + count);
					break;
				} else if(num > answer) { //정답이 입력보다 큰경우
					System.out.println("더 큰수를 입력하세요!");
				} else { //정답이 입력보다 작은경우
					System.out.println("더 작은수를 입력하세요!");
				}		
				
			} catch(Exception e) {
				System.out.println("정수만 입력하세요!");
				scan.nextLine();
				count++;
			}
			
			
			
		} //////
		
		
	}
}
