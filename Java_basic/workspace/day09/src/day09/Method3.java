package day09;

import java.util.Scanner;

public class Method3 {
	
	
	public static double CmtoFt() {
		double ft = 30.48;
		return ft;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("����� Ű�� �Է����ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.println("����� Ű�� ��Ʈ�� ȯ���� �����");
		System.out.println(height / CmtoFt() + "ft �Դϴ�.");
		
		sc.close();
	}
}
