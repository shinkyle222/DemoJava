package day06.import_ex;

//import day06.fruit.Apple; //패지키명을 포함한 클래스명
//import day06.fruit.Melon;
import day06.fruit.*; //패키지 안에 클래스를 다 사용할 떄 뒤에 * 붙인다.

public class MainClass {

	public static void main(String[] args) {
		
		Apple app = new Apple();
		Melon melon = new Melon();
		
		int a = 1;
		System.out.println(a);
		System.out.println(melon); //주소값
		System.out.println(app);
		
		int[] arr = new int[5];
		System.out.println(arr[1]);
		
		String str = ""; //String 사실 참조타입이다. 기본 클래스이기에...
		//String str = new String("야"); <- 이렇게도 사용 가능
		
		
		
		
	}
}
