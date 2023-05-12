package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		//me.year = 2022;
		//값 저장할 때는 set 데이터를 불러올때는 get
		me.setYear(2022);
		me.setMonth(12);
		me.setDay(30);
		me.setSsn("123456-7891012");
		
		int year = me.getYear();
		System.out.println(year);
		
		String ssn = me.getSsn();
		System.out.println(ssn);
	}
}
