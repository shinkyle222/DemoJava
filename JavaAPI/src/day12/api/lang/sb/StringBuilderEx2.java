package day12.api.lang.sb;

public class StringBuilderEx2 {

	public static void main(String[] args) {
		
		//문자열과 향상된 문자열과 차이
		
		long start = System.currentTimeMillis();
		
		/*//객체가 있어 수행시간이 느리다. 7~8초
		String str = "A";
		for(int i = 1; i <= 300000; i++) {
			str = str + "A";
		}
		*/
		
		//새로운 객체 없이 더하기에 수행시간이 빠르다. 0.007~8초
		StringBuilder sb = new StringBuilder("A");
		for(int i = 1; i <= 300000; i++) {
			sb.append("A");
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("수행시간:" + (end - start) * 0.001);
		
	}
}
