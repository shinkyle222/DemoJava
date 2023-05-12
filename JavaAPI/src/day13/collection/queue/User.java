package day13.collection.queue;

public class User implements Comparable<User>{

	private String name;
	private int age;
	
	
	//생성자
	public User() {
	}
	
	//Constructor User Fields
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//getter /setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override //toString의 주소값을 return으로 반환
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(User o) {
		
	//내꺼와 매개변수로 들어오는 User객체의 멤버변수 값의 비교
		//내가 앞에 있으면 음수이고 내가 사전적으로 뒤에 있으면 양수가 나온다.
		//똑같으면 0이 나온다.
		//this.name 나의 것 / getName 너의 것
		
//		return this.name.compareTo(o.getName()); //문자열 이름 사전순 오름차순 (음수)
//		return o.getName().compareTo(this.name); //문자열 이름 사전순 내림차순 (양수)
		
//		return Integer.compare(this.age, o.getAge()); //나이 오름차순
		return Integer.compare(o.getAge(), this.age); //나이 내림차순
		//양수나오면 내림차순 정렬
		//음수나오면 오름차순 정렬
	}
}
