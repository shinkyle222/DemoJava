package quiz_w2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FruitStore {
    private int total;
    private int[] coinUnit = {10000, 5000, 1000, 500, 100, 50, 10};
    private int[] coin     = {2, 4, 0, 5, 5, 5, 5};
    private String[] fruit = {"사과", "메론", "바나나", "딸기", "수박", "블루베리", "참외", "포도", "배"};
    private int[] price = {4990, 7890, 3990, 14990, 17990, 9990, 1990, 24990, 4590};

    public FruitStore(int total) {
        this.total = total;
    }

    public void account() {
        int sum = Arrays.stream(price).sum();
        int change = total - sum;
        System.out.println("총 매출액: " + sum + "원");
        System.out.println("거스름돈: " + change + "원");
        calculate(change, sum);
    }

    public void receipt() {
        shuffleFruit();
        int i = 0;
        System.out.println("==========영수증==========");
        while (i < 5 && i < fruit.length) {
            System.out.println(fruit[i] + " - " + price[i] + "원");
            i++;
        }
        System.out.println();
    }

    private void shuffleFruit() {
        List<String> fruitList = Arrays.asList(fruit);
        Collections.shuffle(fruitList);
        fruitList.toArray(fruit);
    }

    private void calculate(int money, int total) {
        int i = 0;
        while (money > 0 && i < coinUnit.length) {
            int count = money / coinUnit[i];
            if (count > coin[i]) {
                count = coin[i];
            }
            money -= count * coinUnit[i];
            coin[i] -= count;
            i++;
        }
        System.out.println("==========거스름돈 내역==========");
        for (int j = 0; j < coinUnit.length; j++) {
            System.out.println(coinUnit[j] + "원: " + (coin[j] * coinUnit[j]) + "원");
        }
        System.out.println("사장님 시제 보충해주세요.");
    }
}
