package day13.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		//Map인터페이스를 구현하는 클래스 HashMap
		//키(K)에 대한 타입과 값(V)에 대한 타입
		//탐색이 빠릅니다.
		
		//HashMap<Integer, String> map =  new HashMap<>();
		//위와 밑에 식중에 아무거나 사용하면 같은 값이 나온다.
		Map<Integer, String> map =  new HashMap<>();
		
		//맵에 값을 저장 put(키, 값)
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		map.put(5, "신사임당");
		
		//문자열로 맵의 결과 출력
		System.out.println(map.toString());
		System.out.println(map.size());
		
		//맵에 동일한 키를 저장하면?
		//4번에 대한 값이 바뀜
		map.put(4, "강감찬");
		System.out.println(map.toString());
		
		//맵의 값을 얻기 get(키) :값을 반환
		String item = map.get(3);
		System.out.println("3번 키에 대한 값:" + item);
		
		//Key의 유무확인 Containskey(키)
		if(map.containsKey(3)){
			System.out.println("3번 키가 존재함");
		}
		
		//맵의 삭제 remove(키)
		map.remove(4);
		System.out.println(map.toString());
		
		//맵의 순회
		//방법 1
		Set<Entry<Integer, String>> entrySet = map.entrySet(); //맵을 => 셋으로 변경
			
		//엔트리에는 키, 값을 꺼내는 기능
		for(Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("---------------------------------------");
		//방법 2
		Set<Integer> set = map.keySet(); //키만 꺼내서 set에 저장
		for(int key : set) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		System.out.println("---------------------------------------");
		
		//맵에 객체를 담는 모형
		//Map<Integer, 유저> map2 = new HashMap<>();
		
		//값을 무엇이든 담으려면 Object도 사용 가능
		Map<Integer, Object> map2 = new HashMap<>();
	}
}
