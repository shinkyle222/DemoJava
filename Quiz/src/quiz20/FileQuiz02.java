package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {

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

		Date date = new Date();

		SimpleDateFormat abc = new SimpleDateFormat("yyyyMMdd");
		String today = abc.format(date);

		String path1 = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + today;

		try {
			File file = new File(path1);
			if(file.exists() == false) {
				file.mkdir();
				System.out.println("폴더생성완료");
			} else {
				System.out.println("이미 폴더가 존재합니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("==============================================");

		Scanner scan = new Scanner(System.in);
		String name = scan.next();

		String path2 = path1 + "\\" + name + ".txt";

		try (Writer fw = new FileWriter(path2)) {

			System.out.println("내용을 입력하세요>" + "\n" + "그만을 입력 받으면 멈춥니다.");
			while(true) {
				String word1 = scan.nextLine() ;
				fw.write(word1 + "\n");

				if(word1.equals("그만")) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 

		System.out.println("==============================================");

		try (BufferedReader br = new BufferedReader(new FileReader(path2))) {

			String result;
			while((result = br.readLine()) !=null) {
				System.out.println(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

