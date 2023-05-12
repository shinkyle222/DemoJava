package day16.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx2 {

	public static void main(String[] args) {
		
		/*
		 * flush() - 중간중간 파일을 즉시 쓰고 싶으면 flush()를 사용합니다.
		 * 버퍼라이트가 끝나면 자동으로 flush() 나감
		 */

		Scanner scan = new Scanner(System.in);
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test2.txt";
		
		//bufferedwriter가 종료가 될 때 자동 flush가 된다. (입력 한 것이 한번에 txt에 저장)
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
		
			System.out.println(">");
			String word1 = scan.next();
			bw.write(word1);
			bw.flush(); //버퍼에 있는 내용을 내보낸다. (버퍼는 마지막에 한번에 해도 중간 중간에 해도 된다.)
			//중간중간에 넣으려면 write하고 flush, write하고 flush 이런식으로 해야함.
			
			System.out.println(">");
			String word2 = scan.next();
			bw.write(word2);
			
			System.out.println("파일출력 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
