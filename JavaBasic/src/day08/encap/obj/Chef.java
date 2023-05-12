package day08.encap.obj;

public class Chef {

	//int a; 정수를 매개변수
	//chef를 매개변수로 chef c;
	//객체로 생성하려면 멤버변수를 chef c에 넣는다. chef c = new chef();
	
	private String name = "홍연복";
	
	public void cooking() {
		System.out.println("요리사");
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	
	
}
