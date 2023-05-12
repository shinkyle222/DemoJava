package quiz_w1;

import java.util.Scanner;

public class Quiz01_1 {

	/*
	 * 상품명과 상품 가격을 차례대로 입력 받아 등록한 후, 2000원으로 구매 가능한 상품들을 출력해 봅시다(단, 등록 가능한 상품은 총 100개 입니다).
	1. 상품명을 저장하는 stock 배열과 상품 가격을 저장하는 price 배열을 생성합니다.
	2. 0을 입력할 때까지 계속하여 상품명과 상품 가격을 입력 받아 배열에 순서대로 저장합니다.
	3. 상품을 다 등록하면, 등록된 상품과 상품 가격을 <입출력 예시>와 같이 출력합니다. 
	4. 2000원으로 구매 가능한 물품은 무엇이며, 총 몇 개가 있는지 출력합니다(구매 가능 물품은 1개의 상품을 구매한다고 가정).
	quiz 19
	 */
	
	//switch는 if문과 비슷(조건문), while은 for문과 비슷(반복문)
	
	public static void main(String[] args) {

		String[] stock = new String[100];
		int[] price = new int[100];
		int index = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 100; i++) {

			System.out.print("추가할 물품>> ");
			stock[i]=sc.next();

			System.out.print("물품의 가격>> ");
			price[i]=sc.nextInt();

			System.out.print("그만 추가하고 싶으면 0 입력 >> ");
			String s = sc.next();

			index++;

			if(s.equals("0")) {
				String str = "상품목록 [ ";
				for (int j = 0; j < index; j++) {

					if(j==index-1) {
						str = str+stock[j]+"-"+price[j];
					}else

						str = str+stock[j]+"-"+price[j]+" / ";
				}

				str= str+" ]";

				System.out.println("==============================");
				System.out.println(str);
				System.out.println("==============================");

				String buy = "";
				int count = 0;
				for (int j = 0; j < index; j++) {
					if(price[j]-2000<=0) {

						if(j==index-1) {
							buy+=stock[j];
						}else
							buy+=stock[j]+", ";
						count++;
					}
				}

				System.out.println("구매가능 물품: "+buy);
				System.out.println(count+" 개 구매 가능");

				break;
			}
		}
	}
}