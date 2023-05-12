package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {

		noReturn("Hello");
		
		String result = method2("가", "나");
		System.out.println("결과:" + result);
		
//		String result1 = method3(1, 2, "다");
//		System.out.println("결과:" + result1);
		
		String result2 = method4(10);
		System.out.println("결과:" + result2);
		
		String result3 = method5(5, "라");
		System.out.println("결과:" + result3);
		
		int result4 = maxNum(5, 10);
		System.out.println("결과:" + result4);
		
//		int result5 = abs();
//		System.out.println("결과 값은:" + result5);
		
	}
	//"안녕" 출력
	static void noReturn(String s) {
		if(s.equals("Hello")) {
			System.out.println("안녕");
			return;
		}


	}

	//전달 받은 매개 변수 리턴 (String / String)
	static String method2(String a, String b) {
		return a + b;
	}
	
	//세 매개변수 합 리턴
//	static Double method3(int c, int d, double e) {
//		
//		double dbl = "";
//		for(int i = 1; i <= c; i++) {
//			dbl += e;
//		}
//		return dbl;
//	}
	
	//매개 변수가 짝수면 "짝수", 홀수라면 "홀수" 리턴
	static String method4(int q) {
		String str = ""; //문자열을 반환해야하기에 String str 들어온다. (짝 홀수 판단해서 담을려고 밖에다 담았다.)
		if(q % 2 == 0) {
			str = "짝수입니다";
		} else {
			str = "홀수입니다";
		}
		return str;
	}

	//매개 변수 int만큼 String 반복 출력
	static String method5(int o, String p) {
		
		String str = "";
		for(int i = 1; i <= o; i++) {
			str += p;
		}
		return str;
	}
	
	//매개 변수 2개를 입력받아 큰 수 리턴
	static int maxNum(int num1, int num2) {
		int result4 = num1 + num2;
		return result4;
	}
	
	//절대값 리턴
	static void abs(int w) {
		String integer = "";
//		if(Math.abs(int w)) {
			System.out.println("");
			return;
		}
	}

