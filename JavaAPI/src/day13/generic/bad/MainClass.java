package day13.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * Object형으로 선언하면 무엇이든 저장할 수 있지만, 
		 * 그 값을 사용할 때, 알맞은 타입으로 반드시 형변환을 해야 합니다.
		 * 
		 * 잘못 형변환 하면, 예외가 발생합니다.
		 */
		
		ABC abc = new ABC();
		abc.setObj("홍길동");
		//어떤 사람이 코드를 사용할때 어떤 타입을 사용한지 알 수가 없다.
		
		Object name = (String)abc.getObj();
		System.out.println(name);
		
		ABC abc2 = new ABC();
		abc2.setObj(new Person());
		Person p = (Person)abc2.getObj();
		
	}
}
