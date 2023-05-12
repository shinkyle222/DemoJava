package day08.super_2;

public class Person {

	String name;
	int age;
	
	Person(String name, int age){ //name이 다 갈색인 이유가 String name과 가까워서 그렇다.
		this.name = name; //위를 예방하기 위해 앞에 this.을 붙인다.
		this.age = age;
		
//		System.out.println(this); //나 자신을 나타내는 주소값
	}
	
	Person(String name) { //String name만 받는 생성자, 생성자 오버로드
//		this.name = name;
//		this.age = 1;
//		System.out.println(this);
		this(name, 1);  
	}
	
	Person() {
//		this.name = "이름없음";
//		this.age = 1;
//		System.out.println(this);
		this("이름없음", 1);
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
}
