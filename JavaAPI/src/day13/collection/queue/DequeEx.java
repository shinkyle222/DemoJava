package day13.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
	
		//ArrayDeque<Integer> que = new ArrayDeque<>();
		//위와 아래와 같은 결과값 출력
		Deque<Integer> que = new ArrayDeque<>();
		
		//뒤에서 추가
		que.offerLast(1);
		que.offerLast(2);
		que.offerLast(3);
		que.offerLast(4);
		
		System.out.println(que.toString());
		
		//앞에서 꺼내기 (listget과 다르게 빠짐과 동시에 원소를 반환해준다.)
		int n = que.pollFirst();
		System.out.println("반환된 원소:" + n);
		que.pollFirst();
		que.pollFirst();
		que.pollFirst();
		System.out.println(que.toString());
		
		System.out.println("--------------------------------------");
		
		//앞에서 추가 (앞에서 먼저 들어간게 밀려서 배열 맨 뒤로 간다.)
		que.offerFirst(1);
		que.offerFirst(2);
		que.offerFirst(3);
		que.offerFirst(4);
		System.out.println(que.toString());
		
		//뒤에서 꺼내기
		que.pollLast();
		System.out.println(que.toString());
		
		//[4, 3, 2]
		//list의 get처럼 앞에서 or 뒤에서 값을 확인만하기
		//list의 get처럼 실제 값을 없애는 것이 아니고 값만 나와서 출력
		System.out.println(que.peekFirst());
		System.out.println(que.peekFirst());
		System.out.println(que.peekFirst());
		
		//큐는 변함이 없음
		System.out.println(que.toString());
		
		//User는 참조타입이기에 주소값만 나오고,
		//기본타입 Integer 같은 숫자 기본, 실수, 정수는 그냥 그 값 그대로 나온다.

	}
}
