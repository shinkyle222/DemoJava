package quiz_w1;

import java.util.Scanner;

public class Quiz02 {

		//9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값과 최소값을 찾고 
		//각각 몇 번째 수인지를 구하는 프로그램을 작성하시오.

		//예를 들어, 서로 다른 9개의 자연수 (3, 29, 38, 12, 57, 74, 40, 85, 61)
		//이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이고 최소값은 3, 이 값은 1번째 수이다.

		//(입력) 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

		//(출력) 첫째 줄에 최댓값과 몇 번째 수인지를 출력하고, 둘째 줄에는 최소값과 몇 번째 수인지 쉼표로 구분하여 출력한다.
		//(예제 출력) 최댓값: 35, 3번째 / 최소값: 3, 1번째

	    public static void main(String[] args) {
	    	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇 개의 숫자를 입력하시겠습니까? ");
		int count = scan.nextInt(); 
		int count1 = 1;
		int count2 = 1;
		int[] num = new int[count]; 
		
		for(int i = 0; i < num.length; i++) {  
			num[i] = scan.nextInt(); 
		}
		scan.close(); 
		
		// 최댓값 구하기
		int max = num[0];
		for(int i = 1; i < num.length; i++) {
			if(num[i] > max){
				max = num[i];
				count1 = i+1;
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최댓값 수의 위치 : " + count1);
		
		// 최솟값 구하기
		int min = num[0];
		for(int i = 1; i < num.length; i++) {
			if(num[i] < min){
				min = num[i];
				count2 = i+1;
			}
		}
		System.out.println("최솟값 : " + min);
		System.out.println("최솟값 수의 위치 : " + count2);
	}
}
