package day03;

import java.util.Arrays;

public class ArrayBasic {
	
	public static void main(String[] args) {
		//배열 사용
		//배열은 변수의 집합, 배열은 데이터 타입이기도 하다.
		//배열은 상자가 붙어 있는 형태이며, 한번에 어떤 변수에 저장하는 형태
		//배열은 어떻게 만드냐, 선언하고 실제 배열을 생성을하고, 배열에다 값을 넣는 초기화 과정을 거친다.
		//선언 - 타입 뒤에다 대가로를 넣는다. int[] arr; 대가로를 붙이면 배열, 대가로를 떼면 변수가 된다.
		//생성 - 상자 몇개를 만들어서 집어 넣는 작업을 생성이라 부른다. arr = new int[5 ex)크기가 들어간다.] 
		// - 5개의 상자를 만든다. 10개면 10개 상자의 순서가 몇번쨰인지 알아야 사용가능하다. 모든 상자가 0부터 시작한다. 
		// - 간혹가다가 1부터 사용하긴 하나 모든 언어가 똑같기에 0부터 시작한다. 배열의 마지막 상자는 길이보다 1작다. 그게 index 1이다.
		//초기화 - 배열을 사용하고 초기화 하는 방법, 초기화 방법은 index 번호를 적는다. arr[0] = 1; arr[1] = 2; 
		
		//배열 선언
		int[] arr;
		
		//배열의 생성
		arr = new int[5];
		
		//배열의 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//배열의 모형
		System.out.println(arr); //이대로 출력하면 이상한 값이 나온다. 모형을 한번에 안보여주기에...
		                         //이상한 것이 주소값 (배열의 생성위치)
		//배열의 모형을 문자열로 출력 (많이 쓰니 식을 외워라)
		System.out.println(Arrays.toString(arr));
		
		//배열의 값의 변경
		arr[2] = 100;
		System.out.println(Arrays.toString(arr));
		
		//배열의 길이보는 명령어 (암기)
		System.out.println("배열의길이:" + arr.length);
		
		//배열을 선언하는 다양한 방법. (암기)
		//1st
		int[] arr2 = new int[3];
		
		//2nd
		int[] arr3 = new int[] {1,2,3}; //크기가 없이 중가로를 열고 초기화 값을 한번에 넣는 방법
		
		//3nd
		int[] arr4 = {1,2,3}; //바로 초기화 하는 방법 (2nd과 같은 똑같은 문장)
								// 1st와 3nd 방법을 사용 2nd는 x
		
		//배열은 초기값을 지정하지 않으면 기본값으로 자동초기화
		//int는 0, double은 = 0.0, String = null
		System.out.println(Arrays.toString(arr2));
		

	}

}
