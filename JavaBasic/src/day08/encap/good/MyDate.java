package day08.encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수에 접근할 때, 미리생성 해놓은
	 * getter/setter를 사용합니다.
	 * 
	 * setter 메서드
	 * 1.값을 저장하는 용도의 메서드
	 * 2.접근제어자는 public으로 선언하고 이름은 set + 멤버변수명으로 지정
	 */
	
	public void setYear(int year) { //setter 메서드는 무조건 카멜 표기법으로 저장할 것
		
		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 연 값입니다.");
		} else {
		this.year = year;		
		}
	}
	
	/*
	 * getter메서드
	 * 1. 은닉변수의 값을 조회하는 메서드
	 * 2. 접근제어는 public, 반환유형이 있고, 이름은 get + 멤버변수명
	 */
	
	public int getYear() { //getter 메서드는 무조건 카멜 표기법으로 저장할 것
		return year;
		
	/*
	 * 1. month, day, ssn에 getter/setter 생성
	 * 
	 *  month - 1~12월까지만 저장
	 *  day - 1~31일까지만 저장
	 *  ssn - 하이픈은 제거하고 13자리까지만 저장가능 replace(), length()
	 *  
	 */
	}
	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			System.out.println("잘못된 월 값입니다.");
		} else {
			this.month = month;
		} 
	}
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		
		if(day < 1 || day > 31) {
			System.out.println("잘못된 일 값입니다.");
		} else {
			this.day = day;
		} 
	}
	public int getDay() {
		return day;
	}
	
	//ssn
	public void setSsn(String ssn) {
		ssn = ssn.replace("-", "");
		if(ssn.length() != 13) {
			System.out.println("주민번호는 13자리 입니다.");
		} else {
			this.ssn = ssn;
		}
	}
	
	public String getSsn() {
		return ssn;
	}
}
