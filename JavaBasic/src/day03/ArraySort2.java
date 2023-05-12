package day03;

import java.util.Arrays;

public class ArraySort2 {

	public static void main(String[] args) {
		
		//버블정렬 - 가장느림 (큰 값을 뒤로보낸다.) 
		int[] arr = {5, 23, 1, 43, 200, 100, 40}; //바로 붙어있는 뒤에 값과 비교 그리고 크면 뒤로 보내며 맨 큰 값이 뒤로 간다. 
		//5, 1, 23, 43, 100, 40, 200 //1회전
		//1, 5, 23, 43, 40, 100, 200 //2회전
		//1, 5, 23, 40, 43, 100, 200 //3회전 - 정렬완성
		
		//바깥반복문은 회전수
		//안쪽반복문이 ?		
		for(int i = 0; i < arr.length-1; i++) { //length 7회전이 돌아가니 -1을 넣어야 6회전
			for(int j = 0; j < arr.length-i-1; j++) { //미만으로 돌기 떄문에 6이 넣으면 실제로 5까지만 돈다.
				System.out.println(i + "-" + j);
				if(arr[j] > arr[j+1]) { //j가 다음번째 보다 크면 자리를 바꾼다.
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
			
		//아주 유용한 기능
		Arrays.sort(arr); //가장 빠른정렬 퀵정렬 (위에 For문이 주석일 때 대신 차순 정렬을 해준다.) 
		
		System.out.println(Arrays.toString(arr));
	}
}
