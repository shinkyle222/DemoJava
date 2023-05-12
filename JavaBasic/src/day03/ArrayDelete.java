package day03;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		//삭제의 개념 - 배열은 삭제가 없습니다.
		//중간에 빵꾸가나면 index로 반복문이 다시돈다.
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] newArr = new int[arr.length -1]; //삭제한 후 복사할 새로운 배열 
		
		
		int index = 5; //삭제할 위치 5 뒤에 숫자 6
		
		for(int i = index; i < arr.length - 1; i++) { //배열에 마지막 10 때문에 length-1을 해야한다.
			arr[i] = arr[i+1];
		}
		
		//새로운 배열에, 기존배열을 옮겨 담는 작업
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		//기존 arr는 지움
		arr = null;
		newArr = null;
		
		System.out.println(Arrays.toString(newArr));
		
//		System.out.println(Arrays.toString(arr)); //결과값이 6이 사라지고 10이 그대로 남는다.
	}
}
