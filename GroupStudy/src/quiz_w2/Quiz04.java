package quiz_w2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
    	
    	/*
    	 *1. 복권을 구매하러 왔습니다. 구매한 복권의 번호를 출력합니다.
        	(복권 숫자는 랜덤입니다. 범위는 1~45 까지 입니다!)
        	(Random 클래스는 API 주제여서 사용하진 않았으나, 사용하셔도 됩니다.)

    	  2. 이번 주 당첨 번호를 출력하고

    	  3. 내가 산 복권번호와 이번주 복권 번호를 비교해서
       		 꽝인지, 당첨이 됐는지 출력해봅시다.
       	 	 (당첨 유무 출력은 자유롭게 해주셔도 됩니다!)

    	  4. 단, 복권을 구매할 때 수동으로 번호 3개를 지정합니다.
        	 (수동으로 3개, 자동으로 3개 출력되면 됩니다.)

        	 ex. lotto(3,7,10);	
             출력시 -> [3,7,10,39,36,43] 
    	 */
    	
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // 복권 번호 생성
        int[] lotteryNumbers = new int[6];
        for (int i = 0; i < 3; i++) { // 수동으로 선택한 복권 번호 입력 받기
            System.out.print((i + 1) + "번째 수동으로 선택한 복권 번호: ");
            lotteryNumbers[i] = sc.nextInt();
        }
        for (int i = 3; i < 6; i++) { // 자동으로 생성된 복권 번호 생성
            int number = rd.nextInt(45) + 1;
            for (int j = 0; j < i; j++) { // 중복 체크
                if (number == lotteryNumbers[j]) {
                    number = rd.nextInt(45) + 1;
                    j = -1;
                }
            }
            lotteryNumbers[i] = number;
        }

        // 복권 번호 출력
        System.out.print("선택한 복권 번호: ");
        Arrays.sort(lotteryNumbers);
        for (int num : lotteryNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 이번 주 당첨 번호 생성
        int[] winningNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            int number = rd.nextInt(45) + 1;
            for (int j = 0; j < i; j++) { // 중복 체크
                if (number == winningNumbers[j]) {
                    number = rd.nextInt(45) + 1;
                    j = -1;
                }
            }
            winningNumbers[i] = number;
        }

        // 이번 주 당첨 번호 출력
        System.out.print("이번 주 당첨 번호: ");
        Arrays.sort(winningNumbers);
        for (int num : winningNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 당첨 결과 출력
        int matched = 0;
        for (int num : lotteryNumbers) {
            if (Arrays.binarySearch(winningNumbers, num) >= 0) {
                matched++;
            }
        }
        if (matched == 6) {
            System.out.println("1등에 당첨되셨습니다! 축하합니다!");
        } else if (matched == 5) {
            System.out.println("2등에 당첨되셨습니다!");
        } else if (matched == 4) {
            System.out.println("3등에 당첨되셨습니다!");
        } else if (matched == 3) {
            System.out.println("4등에 당첨되셨습니다!");
        } else {
            System.out.println("아쉽게도 꽝입니다. 다음 기회에 다시 도전해보세요!");
        }
    }
}
