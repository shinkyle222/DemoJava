package quiz01;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		/* => 문제출저:
		 * 1.가로, 세로길이를 입력을 받습니다.
		 * 2.가로, 세로길이만큼 사각형을 출력합니다.
		 * 3.단, 윤곽만 나오면 됩니다.
		 * 
		 * 힌트: 1행, 마지막행, 1열, 마지막열만 출력
		 */
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("가로> ");
//		int num1= scan.nextInt(); //가로출력
//		System.out.print("세로> ");
//		int num2 = scan.nextInt(); //세로출력
//
//		for(int i=1; i<=num2; i++) {
//			if(i == 1 || i == num2) {
//				for(int j=1; j<=num1; j++) {
//					System.out.print("?"); // 가로끝과 세로끝에 뭘 그릴지 텍스트 지정
//				}
//			} else {
//				System.out.print("!"); //왼쪽세로줄 1열, 맨우측열, 끝열을 제외한 텍스트 지정
//				for(int j=1; j<=num1-2; j++) { // -2를 해야하는 이유는 우측 끝 맨 텅빈 부분에서 별 테두리를 이룬 2개를 뺀 것
//					System.out.print(" "); //위에 식안에 테스트 지정 or 제외
//				}
//				System.out.print("*"); //오른쪽 세로중 끝열 텍스트 지정
//			}
//			System.out.println();
		
		//사각형 전체 출력 (강사님)
//		Scanner scan = new Scanner(System.in);
//		System.out.print("가로>");
//		int w = scan.nextInt();
//		System.out.print("세로>");
//		int h = scan.nextInt();
//		
//		//행
//		for(int i = 1; i <= h; i++) {
//			
//			for(int j = 1; j <= w; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
		
		//사각형 비어서 출력 (강사님)
		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int w = scan.nextInt();
		System.out.print("세로>");
		int h = scan.nextInt();
		
		//열은 i 행은 h
		for(int i = 1; i <= h; i++) {
			
			for(int j = 1; j <= w; j++) {
			
				if(i == 1 || i == h) {//첫행, 마지막행
					System.out.print("*");
				} else { //첫행, 마지막행이 아닌경우
					if(j == 1 || j == w) { //첫열, 마지막열
						System.out.print("*");
					} else {
						System.out.print(" ");	
					}
				}		
			}
		}
	}
}
