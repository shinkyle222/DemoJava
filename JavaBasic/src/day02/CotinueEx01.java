package day02;

public class CotinueEx01 {
	
	public static void main(String[] args) {
		//continue는 반복문을 건너뜀
		//for문에서는 증/감식으로 이동됩니다.
		/*
		for(int i = 1; i <= 10; i++) {
			if(i == 5) { //5를 맞을때 건너뛰고 continue되서 카운팅한다.
				continue;
			}
			System.out.println(i);
		}*/
		
		//while문에서는 continue는 조건식으로 갑니다. (문제를 많이 풀어야 따라갈 수 있음)
		int i = 1;
		while(i <= 10) {
			
			if(i == 5) {
				i++; //증감식
				continue;
			}
			System.out.println(i);
			
			i++;
		}
		
	}
}
