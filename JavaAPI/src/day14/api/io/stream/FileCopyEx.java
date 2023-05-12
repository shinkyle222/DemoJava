package day14.api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileCopyEx {

	public static void main(String[] args) {
		
		/*
		 * FileInputStream, FileOutputStream은
		 * 동영상, 이미지 파일을 읽거나 쓸 때 사용합니다. 
		 */
		
		String readPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\메서드1.mp4";
		String writePath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\메서드1_copy.mp4";
		
		//향상된 try ~ catch문
		//Closeable 인터페이스를 상속받은 클래스만 사용이 가능
		//close작업을 대신 함
		
		
		try(InputStream is = new FileInputStream(readPath);
			OutputStream out = new FileOutputStream(writePath)){
			
			//읽음
			byte[] arr = new byte[2048]; //최대 2kb까지
			
			int result;
			while( (result = is.read(arr) ) != -1 ) { //읽은 값이 -1이 아닐때까지
				
				//result를 가지고 쓰기
				//마지막에 원치 않은 데이터가 담길 수 있으며 쓰지 않았다면 0, 0, 0으로 나가면서 문제가 된다.
				out.write(arr, 0, result); //arr데이터를 0에서 ~ 바이트배열의 result까지만 씀
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		/* 향상된 try ~ catch문을 써서 밑에 부분은 생략
		finally {
			
			try {
				is.close();
				out.close();	
			} catch (Exception e2) {
				System.out.println("파일 close 에러");
			}
			
		}
		*/
		System.out.println("프로그램 정상종료");
	}
}
