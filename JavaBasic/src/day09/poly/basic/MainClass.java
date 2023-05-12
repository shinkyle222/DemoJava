package day09.poly.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); //상속받은
		c.method02(); //오버라이드 된
		c.method03(); //내꺼
		
		
		System.out.println("=========다형성 적용(형변환)=========");
		
		//Parent처럼 사용됩니다. 단, 자식의 오버라이드 된 메서드가 실행됩니다.
		Parent p = c;
		p.method01();
		p.method02();
		//p.method03();
		
		System.out.println(p); //parent타입
		System.out.println(c); //child타입
		System.out.println(p == c); //child로 생성된 자식은 원래의 객체를 유지함
		
		System.out.println("======클래스 강제 형변환======");
		//원본이 child로 생성되었다면, 강제 형변환이 가능함
		
		Parent pp = new Child();
		System.out.println(pp); //child원본
		
		Child cc = (Child)pp; //강제 형변환
		cc.method01();
		cc.method02();
		cc.method03();
		
		//주의 할점 => 다형성이 적용되었던 객체만 강제형변환이 가능함
		Object obj = new Object();
		//Child ccc = (Child)obj; //runtime exception
		
		System.out.println("=====형변환 또다른 예시=====");
		
		String str = "홍길동";
		Object o = str;
		String result = (String)o; //ok
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
