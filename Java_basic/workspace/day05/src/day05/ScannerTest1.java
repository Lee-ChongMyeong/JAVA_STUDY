package day05;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("������ �ϳ� �Է����ּ��� : ");
	
		int a = scan.nextInt();
		
		System.out.println("����� �Է��� ���� : " + a);
		scan.close();
		
		
	}
	
}
