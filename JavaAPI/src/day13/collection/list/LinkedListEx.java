package day13.collection.list;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		/*
		 * LinkedList
		 * ⇒ 순서 O, 중복 O
		 * ⇒ 노드 객체 (양방향 연결리스트)
		 * 삭제와 삽입은 ArrayList보다 좋은 성능을 발휘하나, 탐색은 느림
		 */
		
		LinkedList<Integer> list = new LinkedList<>();
		
		//list.offer - 앞에 값을 추가하거나 앞에 값을 제거하는 기능 
		//deque = queue와 비슷한 기능
		
		//list와 기능은 동일합니다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//
		System.out.println(list.toString());
		
		//중간에 추가
		list.add(3, 10); //3번째 인덱스에 10추가
		System.out.println(list.toString());
		
		//값 얻기 get()
		int n = list.get(3);
		System.out.println(n);
		
		//값 삭제 remove()
		list.remove(3);
		System.out.println(list.toString());
		
		System.out.println("---------------------------------");
		
		//linklist는 queue의 기능을 구현하기 때문에 queue기능도 사용이 가능
		list.offer(10);
		list.offer(11);
		
		//poll - 배열 앞에서부터 값을 뽑아내고, 실제적으로(오리지널 값) 빠진다.
		System.out.println(list.toString());
		int r = list.poll();
		System.out.println(r);
		System.out.println(list.toString());
	}
}
