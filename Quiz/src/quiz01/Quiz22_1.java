package quiz01;

import java.util.Scanner;

public class Quiz22_1 {

	public static void main(String[] args) {

		//금액의 동전 - 나머지, 몫 활용
		//어떤금액 x가 주어졌을 때, 큰 금액부터 거슬러서 몇개가 나와야 하는지 출력.
		int[] arr = {1000, 500, 100, 50, 10};

		Scanner scan = new Scanner(System.in);
		System.out.print("금액>");
		int x = scan.nextInt();

		int i = 0;
		while(i < arr.length) {
			System.out.println(arr[i] + "원:" + x/arr[i]);
			x = x % arr[i]; //나머지저장
			i++;
		}
	}
}