package day06;

import java.util.Scanner;

public class ParseNumber1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڷ� ������ ���ڿ��� �Է����ּ���.");
		String s1 = scan.nextLine();
		
		int n1 = Integer.parseInt(s1);
		System.out.println("�Է��� ���ڿ��� ���� : " + n1);
		
		scan.close();
		
		
	}
}