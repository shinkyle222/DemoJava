package quiz15;

public class MainClass {

	public static void main(String[] args) {
		
		IBag bag = new MyBag();
		
		bag.insert("tv");
		bag.insert("tv");
		bag.insert("tv");
		bag.insert("radio");
		bag.insert("radio");
		
		bag.print();
		System.out.println("인덱스위치:" + bag.search("radio") );
		
		System.out.println("삭제?:" + bag.delete("radio"));
		bag.print();
		
	}
}
