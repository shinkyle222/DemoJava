package quiz01;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력: ");
		int num = scan.nextInt();

		for(int i = 1; i <= num; i++) {
			//공백
			for(int j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}	//별출력
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 	 *
		    **
		   ***
		  ****
		 ***** 
		 */

		}
	}
