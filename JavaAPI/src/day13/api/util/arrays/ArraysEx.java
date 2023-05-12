package day13.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		
		int[] arr = {3, 1, 2, 5, 6, 7};
		
		//Arrays는 (static 정적메서드만 사용가능.)
		
		//정렬 (빠르다 그 이유는, 
		//반을 쪼개서 왼쪽은 작은 숫자 우측은 큰 숫자 이런 식으로 정렬해주기 때문이다.)
		Arrays.sort(arr);
		
		//배열을 문자열로
		System.out.println(Arrays.toString(arr));
		
		//배열 탐색 - 선행조건:차순 정렬
		int result = Arrays.binarySearch(arr, 4); //앞에는 배열명, 뒤에는 찾을 값
		System.out.println(result); //음수가 나오면 값은 없음 ex) -4
		
		int result2 = Arrays.binarySearch(arr, 5);
		System.out.println(result2); //값에 대한 위치 반환 
		
		//배열복사
		int[] newArr = Arrays.copyOf(arr, arr.length); //앞에는 복사할 배열, 뒤에는 새로운 배열의 길이
		
		System.out.println(Arrays.toString(newArr));
		System.out.println(arr == newArr); //깊은복사다 (완전히 새로운 것이기에)
		
		int[] newArr2 = Arrays.copyOf(arr, arr.length * 2);
		System.out.println(Arrays.toString(newArr2));
		
		//배열크기지정복사
		int[] newArr3 = Arrays.copyOfRange(newArr, 1, 3); //1이상 ~ 3미만 가져와서 복사
		System.out.println(Arrays.toString(newArr3));
		
		//배열의 원소비교 (주소값이 아닌 원소값의 비교)
		if(Arrays.equals(newArr, arr)) {
			System.out.println("배열의 원소가 정확히 일치함");
		}
		
		
		
		
	}
}
