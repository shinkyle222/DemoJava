package quiz01;

public class Quiz12 {

	public static void main(String[] args) {

		// 1. 1000 까지 정수 중에서 4의 배수이면서 , 8의 배수가 아닌 수의 count (개수)
		/*
		 *  강사님 풀이법
		 * 
		 * int = 1;
		 * int = count = 0;
		 * while ( i<= 1000) {
		 * 
		 * 		if (i%4 ==0 && i%8 ! ==0) {
		 * 		
		 * 		count ++  / 1 증가
		 * 		}
		 * 		
		 * 		1++;
		 * 		System.out.println("개수:" + count );
		 * 			
		 */

		// 2. 50~100 까지의 합계
		/*
		 * 
		 *  강사님 풀이법
		 * 		
		 * 		int sum = 0;  // 합계누적
		 * 		int a = 50;
		 * 		while (a<= 100) {
		 * 		
		 * 		sum += a;
		 * 		a++;
		 * 		}
		 * 		System.out.println("50~100까지합:" + sum);
		 * 		

		 */		
		
		
		int count = 0;
		int i  = 1;

		while (i<=1000) {

			if (i % 8 != 0 && i % 4 == 0  ) {

				// System.out.println(i);
		count++;
	} i++;
	}  System.out.println(count);
	
	}
}



		
		
		