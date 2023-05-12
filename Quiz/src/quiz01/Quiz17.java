package quiz01;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		/*
		 * 1. 입력받은 수까지의 소수들의 합 ex) 7 -> 2, 3, 5, 7
		 * 7까지 확인하기 위해 1은 1, 2는 2까지, 3은 3까지 반복문을 돈다....
		 * 입력 7
		 * -> 바깥반복문은 7까지는 회전
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력>");
		int num = scan.nextInt();
		int sum = 0;

		for(int i = 1; i <= num; i++) { //num 입력받은 곳까지 1부터 올라감
			//약수의 개수를 구한다.
			int count = 0;

			for(int j = 1; j <= i; j++) {//1 -1, 2-1 2-2, 3-1,3-2,3-3,....
				if(i % j == 0) {
					count++; //약수의 갯수를 샌다.
					//System.out.println(i + "-" + j);
				}
			}
			if(count==2) {
				sum += i; //sum = sum+i;
				System.out.println(i + " "); //소수가 구해짐
			}
			
			//각각의 i값이 소수인지를 판별해서 소수라면, sum에 누적하는 코드
			//적절한 시점 초기화...
		}System.out.println("총합은" + sum);
	}
}