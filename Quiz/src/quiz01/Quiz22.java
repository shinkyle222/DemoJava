package quiz01;

import java.util.Scanner;

public class Quiz22 {
	
	public static void main(String[] args) {
		
		//금액의 동전 - 나머지, 몫 활용 
		//어떤금액 x가 주어졌을 때, 큰 금액부터 거슬러서 몇개가 나와야 하는지 출력.
		int[] exchange = {1000, 500, 100, 50, 10};
		
		Scanner scan = new Scanner(System.in);
		
		int received = scan.nextInt();

		System.out.println("금액>" + received + "원");
		for(int i = 0; i < exchange.length; i++){
			int result = received/exchange[i];
				System.out.println(exchange[i]+"원:"+ result +"개");
				received = received - (exchange[i])*(received/exchange[i]);
				//received = received % exchange[i];
		}
		
	}

}
