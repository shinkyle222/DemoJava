package day17.api.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

public class MainClass02 {

	public static void main(String[] args) {

		/*
		 * 람다 함수의 구현 사용문법
		 * Predicate - 매개변수가 하나 있고, boolean형 반환
		 * Consumer - 매개변수 하나 받고, void형 (forEach)
		 * Function - 매개변수 여러 개 받고, 반환은 임의의 값
		 */
		
		List<Integer> list = new ArrayList<>();
		//Random ran = new Random(); 밑에 new Random()으로도 대체 가능

		for (int i = 0; i < 100; i++) {
			list.add(new Random().nextInt(100) + 1); //1~100까지
		}
		System.out.println(list.toString());

		//중간처리 함수들
		//distinct() - 중복제거
		/*
		Stream<Integer> stream = list.stream();
		stream = stream.distinct(); //중간에 등록된 수를 제거해줌 (중복제거)
		stream.forEach((a) -> System.out.println(a + " "));
		*/
		
		//list.stream().distinct().distinct().distinct() =>
		//한번 실행한 다음에 distinct 기능을 계속 사용할 수 있다.
		list.stream().distinct().forEach((a) -> System.out.print(a + " "));
		
		System.out.println("\n----------------------------------------------");
		
		//sort() - 정렬
		list.stream().distinct().sorted().forEach((a) -> System.out.print(a + " "));
		
		System.out.println("\n----------------------------------------------");
		//filter() - 리턴에 true값만 남기고 필터링 = 짝수만
		list.stream().distinct().filter((a) -> a % 2 == 0).sorted().forEach(a -> System.out.print(a + " ")); //매개변수가 하나면 소가로를 생략할 수 있다.
		//return을 사용하고 싶으면 중가로 / true만 사용하고 싶으면 return 제외
		
		System.out.println("\n----------------------------------------------");
		//map() - 반환에 정의 된 값으로 완전히 새로운 스트림반환
		
		list.stream().map((a) -> a % 2 == 0? "짝수" : "홀수" ).forEach(a -> System.out.print(a + " "));
			//아래에 긴 식을 위에 삼항단항식으로 정리해서 사용
		/*
			String str;
			if(a % 2 == 0) {
				str = "짝수";
			} else {
				str = "홀수";
			}
			return str;
		});  
		*/
		
		System.out.println("\n----------------------------------------------");
		//mapToDouble() /더블형 String으로 출력
		list.stream().mapToDouble(a -> a).forEach(a -> System.out.print(a + " "));
		System.out.println("\n----------------------------------------------");
		//mapToInt() /정수형 String으로 출력
		//mapToLong() /long타입 String으로 출력
		
		
	}
}

