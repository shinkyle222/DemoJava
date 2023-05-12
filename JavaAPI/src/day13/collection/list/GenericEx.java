package day13.collection.list;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		//제네릭<?> = 물음표 뜻은 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭<? extends String> = String과 String의 자식들 전달가능
		//제네릭<? super String> = String타입이 될 수 있다면 전달가능
		
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		add1(list1); //무엇이든 다 받을 수 있다.
		add1(list2); //무엇이든 다 받을 수 있다.
		add1(list3); //무엇이든 다 받을 수 있다.
		
		add2(list1); //String 가능
//		add2(list2); //Integer 불가
//		add2(list3); //Object 불가
		
		add3(list1); //String O
//		add3(list2); //Integer X
		add3(list3); //Object O
	}
	//List<?> 위에 3개를 다 받을 수 있다.
	public static void add1(List<?> list) {
		
	}
	//extends String이거나 String의 자식들은 들어갈 수 있다.
	public static void add2(List<? extends String> list) {
		
	}
	//String의 type이면 다 받을 수 있다.
	public static void add3(List<? super String> list) {
		
	}
}
