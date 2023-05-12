package quiz01;

import java.util.Scanner;

public class Quiz25 {

	public static void main(String[] args) {
		//백준 1차원배열 - 10813
		//N과 M번공
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		for(int i = 0; i < m; i++) {
			int temp;
			int a = scan.nextInt();
			int b = scan.nextInt();
			temp = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = temp;
		}
		scan.close();
		for (int basket : arr)
			System.out.print(basket + " ");
	}
}
