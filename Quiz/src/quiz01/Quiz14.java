package quiz01;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		//1. 7~100까지 정수 중에 7의 배수만 가로로 출력. (커서가 맨 마지막 상태에서 가로로 출력할려면 탭으로 줄바꿈을 해야한다.)

		//		Scanner scanner = new Scanner(System.in);
		//		
		//		System.out.print("정수 입력: ");
		//		int num = scanner.nextInt();
		//		
		//		for (int i = 1; i <= num; i++) {
		//			if (i%7 !=0)
		//				continue;
		//			System.out.print(i + " ");
		//		}

		for (int i = 7; i <= 100; i+=7) {
			System.out.print(i + " ");


			//System.out.println(); //줄바꿈

			//2. 1~200까지 정수 중에 9의 배수의 개수를 출력.
			//		
			//		int count = 0;
			//		
			//		for (int i = 1; i <= 200; i++) {
			//			if (i%9 == 0) { //if 문 뒤에 무조건 중가로를 열어야
			//				count++;
			//			}
			//		}
			//		System.out.println("count : " + count);

			int count = 0; //
			for(int j = 1; j <= 200; j++) {
				if(j % 9 == 0) {
					count++; //1씩 증가 
				}
			}	

			//3. 50~100사이의 두 수 사이의 합
			int sum = 0;
			for (int k = 50; k <= 100; k++)  {
				sum += k;
			}
			System.out.println("50-100까지합:" + sum);

			//4. A~Z까지 가로로 붙여서 출력, A=65, Z=90
			String str = "";
			for(char c = 'A'; c <= 'Z'; c++ ) {
				//System.out.print(c);
				str += c; //더하는 문자열을 띄우기 위해 " "사용해도 됨 
				//str 결과값 / char 문자값
			}
			System.out.println(str);
			// 위에 (c) or (str)사용 가능
			//5. 입력받은 정수까지 팩토리얼 5팩토리얼 = 5 * 4 * 3 * 2 * 1

			Scanner scan = new Scanner(System.in);
			System.out.print("정수를 입력하세요 > ");
			int num = scan.nextInt();

			int sum2 = 1;
			for(int o = 1; o <= num; o++) {
				sum2 *= o; //sum2 = sum2 * i (계속 for문이 돌면서 곱한다.)
			}
			System.out.println(num + "!은" + sum2);
		}
	}
}



