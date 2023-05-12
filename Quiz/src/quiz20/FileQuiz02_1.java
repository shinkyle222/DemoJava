package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02_1 {

	public static void main(String[] args) {

		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 20230504file 폴더를 생성합니다
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
		 *    \r\n을 적절하게 이용해서 파일 출력을 완료 
		 *    
		 * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 * 
		 * 폴더명이 있는지, 입력, 출력
		 */

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//1바이트를 2바이트로 바꿔주는 시스템 InputStreamReader 그리고 생성매개자 변수 생성
		//String str = br.readLine();
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date); //년월일
		
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명>");
		String filename = scan.next(); //파일명
		
		//버퍼드리더는 기본 생성자가 따로 없다.
		//리더 클래스가 매개변수로 받을 수 있다.
		
		String filepath = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + now + "file"; //경로
		String path = filepath + "\\" + filename + ".txt";
		
		File file = new File(filepath);
		if(file.exists() == false) {
			file.mkdir();
			System.out.println("폴더생성완료");
		} else {
			System.out.println("이미 존재합니다.");
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path)); 
		     BufferedReader br = new BufferedReader(new FileReader(path));){
			
			//쓰는 작업
			while(true) {
				System.out.println(">");
				String str = scan.nextLine(); 
				
				if(str.equals("그만")) {
					System.out.println("종료합니다.");
					break;
				}
				
				bw.write(str + "\n"); //쓴다.
				bw.flush(); //를 써야 실제적으로 Writer 써지며, 빨리 출력하기위에 필수
			}
			
			//읽는작업
			String result;
			while((result = br.readLine()) !=null) {
				System.out.println(result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

