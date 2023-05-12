package day17.api.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;

public class Test {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			list.add(new Random().nextInt(100) +1);
		}
		System.out.println(list.toString());
		
		OptionalInt r1 = list.stream().distinct().mapToInt(a -> a).min();
		System.out.println(r1.getAsInt());
		
		OptionalInt r2 = list.stream().distinct().mapToInt(a -> a).max();
		System.out.println(r2.getAsInt());
	}
	
}
