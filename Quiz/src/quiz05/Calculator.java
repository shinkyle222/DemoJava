package quiz05;

public class Calculator {
	
	int result;
	double pi  = 3.14;

	void add(int a) { //누적
		result += a;
	}
	void sub(int b) { //차감
		result -= b;
	}
	double circle(int a) { //원의넓이
		return a * a * pi;
	}
	
	void input(double a) {
		System.out.println("1");
	}
	void input(double a, double b) {
		System.out.println("2");
	}
	void input(double a, double b, double c) {
		System.out.println("3");
	}
}
