package day02;

public class BreakEx03 {
	public static void main(String[] args) {

//		//변수를 사용하는 방법
//		boolean flag = false; //탈출을 위한 변수
//		
//		for(char c = 'A'; c <= 'Z'; c++) {
//			for(char l = 'a'; l <= 'z'; l++) {
//				System.out.println(c + "-" + l);
//				if(l == 'f') {
//					flag = true; //탈출을 위해 true로 변경
//					break;
//				}
//			} //end
//			if(flag) break;
//		} //end
//	}
//}

		x:for(char c = 'A'; c <= 'Z'; c++) { //제어문에 이름을 x:라고 붙였다.
			for(char l = 'a'; l <= 'z'; l++) {
				System.out.println(c + "-" + l);
				if(l == 'f') {
					break x; //이름을 사용하여 나오는 이러한 break문을 라벨 방식이라 한다.
					// 현재 위에 식과 같은 정답이 나온다.
				}
			}
		}
	}
}
		