package quiz01;

import java.util.Scanner;

public class Quiz17_1 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("정수입력>");
	int num = scan.nextInt();
	//1-1, 2-1, 2-2 = 약수 / 약수를 구하는 식 -> (i%j)

	int sum = 0; //소수의 합을 누적 변수
	int count = 0; //약수의 개수를 셀 변수

	for(int i = 1; i <= num; i++) { 
		
		count = 0; //초기화
		
		for(int j = 1; j <= i; j++) {
			//System.out.println(i + "-" + j);
			//각각의 i값이 소수인지를 판별해서 소수라면, sum에 누적하는 코드
			//적절한 시점 초기화...
			if(i % j == 0) { //0은 약수
				count++;
			}
		} //end for 
		if(count == 2) { //소수를 sum에 누적한다.
			sum += i;
		}
	}
	System.out.println("입력한 수 중에서 소수의 합:" + sum);
}
}