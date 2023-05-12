package day14.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * 1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream입니다.
		 * 2. 생성자 매개값으로 파일을 쓸 경로가 들어갑니다.
		 * C:\Users\\user\Desktop\course\java\file
		 * 위와 같이 경로에 한글이나 공백을 넣으면 실행이 안된다.
		 * 경로가 역슬래시에서 슬래시로 바뀌어서 사용해도 된다.
		 * 복사하면 왜 2개씩 붙을까? 백슬래시 1개는 명령어를 쓴다는 뜻이여서 그렇다.
		 * 순수한 슬래시를 사용하고 싶으면 2개 사용
		 * 일반 슬래시로는 1개만 사용해도 가능
		 * 
		 * 3. io패키지 거의 모든 클래스들은 생성자에 Throws가 있기 때문에
		 * 반드시 예외처리 문장 안에서 사용합니다. 
		 * 
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		
		//FileOutputStream out = new FileOutputStream(path);
		//위와 아래 같은 표현이다.
		//부모님 타입에다가 담는 추상화 객체 원칙 때문에 이렇게 사용 
		//액세스 거부 에러가 나온 이유는 열어 내용을 넣을 파일이 없기에 예시로 txt 하나 만든다.
		
		try {
			OutputStream out = new FileOutputStream(path);
			
			//첫번째
			//out.write(65);
			//out.write(66);
			//out.write(67);
			
			//두번째
			//byte[] arr = {65, 66, 67, 68, 69}; //배열에 들어있는 데이터를 한번에 씀
			//out.write(arr);
		
			//세번째
			String str = "한글~"; //한글은 1byte기반으로 쓰기엔 적합하지 않습니다.
			//문자열을 바이트 배열로 변환하여 리턴하는 getBytes
			byte[] arr = str.getBytes();
			
			out.write(arr);
			out.close(); //자원해제, 즉 닫는 작업, 한번 쓰고 열어두면 또 다른 걸 사용하면 데이터가 변질이 된다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
