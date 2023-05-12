package day11.inter.basic3;

public abstract class Account {

	private String name;
	
	public Account() {
	}
	
	public Account(String name) {
		this.name = name;
	}
	
	public void method01() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//추상메서드
	public abstract void method02();
	
	
	
	
}
