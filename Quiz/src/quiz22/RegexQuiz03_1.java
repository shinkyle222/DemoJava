package quiz22;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03_1 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.txt";

		try (BufferedReader br1 = new BufferedReader(new FileReader(path))){

			//int cnt = 0; / 22개가 잘 들어오는지 확인하기 위해
			String str;
			while ((str = br1.readLine()) != null) {

				String pattern1 = "[0-9]{8}-[0-9]{2}-[0-9]{12,13}";
				String pattern2 = "[가-힣]+ [가-힣]+";
				String pattern3 = "\\[[가-힣A-Z]+\\]";
				String pattern4 = "\\d+,*\\d+원"; //가격 /* 뜻 - 있을 수도 있고 없을 수도 있고

				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				Matcher m4 = Pattern.compile(pattern4).matcher(str);

				if(m1.find() & m2.find() && m3.find() && m4.find()) {

					System.out.println("===================================");
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					String detail = str.substring(m3.end() +1, m4.start() -1);
					String price = m4.group();
					//1행을 Product 객체에 저장
					Product p = new Product(day, store, grade, detail, price);
					//Product를 리스트
					list.add(p);

					System.out.println(day);
					System.out.println(store);
					System.out.println(grade);
					System.out.println(detail);
					System.out.println(price);

					//cnt++;
				} //end while
				
				//엑셀 쓰기 호출
				createExcel(list);
				
			}
			//System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//public static void createExcel(리스트 매개변수)
	public static void createExcel(List<Product> list) {

		//
		XSSFWorkbook workbook  = new XSSFWorkbook();
		//시트
		XSSFSheet sheet = workbook.createSheet();
		//시트 안에 행
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("날짜");
		row1.createCell(1).setCellValue("지점");
		row1.createCell(2).setCellValue("등급");
		row1.createCell(3).setCellValue("상세");
		row1.createCell(4).setCellValue("가격");
		
		//리스트를 엑셀파일로 쓰기
		for(int i = 0; i < list.size(); i++) {
			
			XSSFRow row = sheet.createRow(i + 1);
			Product p = list.get(i); //리스트 안에 객체
			
			row.createCell(0).setCellValue(p.getDay());
			row.createCell(1).setCellValue(p.getStore());
			row.createCell(2).setCellValue(p.getGrade());
			row.createCell(3).setCellValue(p.getDetail());
			row.createCell(4).setCellValue(p.getPrice());
			
		}

		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.xlsx";

		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path))) {

			workbook.write(bos);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

