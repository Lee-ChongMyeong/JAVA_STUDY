package day10;

public class LocalVariable1 {
	
	public static void Add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Add(3, 5);
		int result = 7;
		System.out.println(result);
		
	}
}
