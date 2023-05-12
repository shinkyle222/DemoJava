package day13.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		/*
		 * Set계열 (List와 완전히 반대다. 순서 x, 중복 x)
		 * ⇒ 인덱스 기준으로 조회하는 메서드가 없습니다.
		 * ⇒ 동일한 값을 저장하면, 들어가지 않습니다.
		 * Set계열 순회할 때는 향상된 포문, 반복자 개념을 사용해야합니다.
		 */
		
		//HashSet<Integer> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		//add()
		//하나의 값들이 상자안에 들어갔을때랑 나올때는 순서대로 나오지 않고,
		//랜덤하게 섞여있기에, 아무거나 나온다.
		//java를 2개 넣어도 1개만 나온다. 중복을 사용하지 않는다.
		set.add("java"); // 사용 X
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java");
		
		//
		System.out.println(set.toString());
		//크기
		System.out.println("크기:" + set.size());
		//삭제
		set.remove("python");
		System.out.println(set.toString());
		
		//순회 (순서대로 회전) => 내부적으로 반복자(Iterator)의 개념을 사용해서 회전시킨다.
		for(String s : set ) {
			System.out.println(s);
		}

		System.out.println("------------------------------------");
		
		//구조를 iterator string 타입으로 바꿔준다.
		//set => iterator 타입으로 변경
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) { //다음이 있다면 true
			System.out.println(iter.next());
		}
		
	}
}
