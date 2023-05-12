package day16.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferWriterEx {

	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙으면 입출력을 빠르게 하는 성능향상 스트림 (보조)
		 * 
		 * 보조 스트림이라 부르고, Reader, Writer, InputStream, OutputStream
		 * 과 같이 사용됩니다.
		 * 
		 * import 링크가 많다면 java.io.*;로 다 사용 가능 및 숨길 수 있다.
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test.txt";
		
		//Writer fw = new FileWriter(path);
		//BufferedWriter bw = new BufferedWriter(fw);
		//위에 2개를 합쳐 아래 하나로 만들 수 있다.
		//BufferedWriter bw = new BufferedWriter(new FileWriter(path));
	
		//Writer객체에 두번째 매개변수에 true주면, 기존파일에 추가합니다.
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
			//맨 뒤에 true가 붙어 append되서 기존 txt 파일에 내용이 계속 추가되서 저장한다.
			String str = "오늘은 날씨가 맑습니다.\n내일은 쉽니다.\n";
			bw.write(str);
			
			System.out.println("파일 쓰기 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
