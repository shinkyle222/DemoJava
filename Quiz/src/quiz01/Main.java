package quiz01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//정확히 입력만 2개
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(a - b);
		
	}
}
