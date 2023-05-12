package quiz01;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt(); //정수입력
		int a = 1;
		while (a <= size) {
			
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			System.out.println("Case #" + a + ": " + (x+y)); //공백 하나도 오타로 인식한다.
			
			//Case #1: 2
					
			a++;
		}
	}
}

	//scan.close(); // scan close는 프로그램 맨 마지막 종료전에 넣는다.
    //nextInt()//nextInt가 공백 기준으로 자른다. + 공백이나 엔터값을 받아준다.
	//1 공백 1 enter