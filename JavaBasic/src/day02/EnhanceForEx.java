package day02;

public class EnhanceForEx {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
		//향상된 포문 - 배열같은 연속된 타입을 돌리기에 적합
		for(int a : arr) {
			System.out.println(a);
		}
		System.out.println("-----------------------");
		
		String[] arr2 = {"월", "화", "수", "목", "금", "금", "금"};
		
		for(String a : arr2 ) {
			System.out.println(a + "요일");
		}
		
		System.out.println("------------------------");
		
		//이 값들의 합계와, 평균 (실수형)을 출력
		int[] score = {50,40,30,20,10};
		
		int sum = 0;
		for(int a : score) {
			sum += a;
		}
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double)sum/score.length); //score.length - 배열의 길이를 알아보는 명령어
		//실수면 잘려나가니 한쪽이 더블이면 된다.
		//int/int = int / double/int = double / byte/byte = int
		//int 작으면 int고 byte보다 크면 큰 타입인 int를 따라간다.
		//3항 연산식과 평균(실수형) 관련 문제가 많으니 공부할 것
	}
}
