package quiz15;

import java.util.Arrays;

public class MyBag implements IBag {
	
	private String[] arr = new String[100];
	private int index;
	
	@Override
	public void insert(String item) {
		arr[index] = item;
		index++;
	}
	@Override
	public void print() {
		for(int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	@Override
	public int search(String item) {
		
		for(int i = 0; i < index; i++) {
			if(arr[i].equals(item) ) {
				return i;
			}  
		}
		
		return -1; //없는 경우 -1
	}

	@Override
	public boolean delete(String item) {
		
		if(item == null) return false;
		
		for(int i = 0; i < index; i++) {
			//찾은경우의 조건
			if(arr[i].equals(item)) {
				//뒤의 아이템을 당기고 종료
				for(int j = i; j < index - 1; j++) {
					arr[j] = arr[j+1];
				}
				
				arr[index-1] = null;
				index--;
				return true;
			}
		}
		
		return false;
	}

}
