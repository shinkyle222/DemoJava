package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		method01();
		
		String r1 = method02("가");
		System.out.println(r1);
		
		Double r2 = method03(1,2,3.14);
		System.out.println(r2);
		
	}
	
	static void method01() {
		System.out.println("안녕하세요.");
	}
	
	static String method02(String s) {
		return s;
	}
	
	static double method03(int a, int b, double c) {
		double result = a + b + c;
		return a + b + c;
	}
}

