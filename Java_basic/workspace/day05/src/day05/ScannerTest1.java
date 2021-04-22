package day05;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("정수를 하나 입력해주세요 : ");
	
		int a = scan.nextInt();
		
		System.out.println("당신이 입력한 정수 : " + a);
		scan.close();
		
		
	}
	
}
