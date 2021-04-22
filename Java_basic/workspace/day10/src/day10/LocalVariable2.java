package day10;

public class LocalVariable2 {
	
	public static void Sub(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);
	}
	
	public static void Sub2(int num1, int num2) {
		int result2 = num1 - num2;
		System.out.println(result2);
	}
	
	public static void main(String[] args) {
		int result = 5;
		Sub(5,3);
		Sub2(4,7);
	}
}


