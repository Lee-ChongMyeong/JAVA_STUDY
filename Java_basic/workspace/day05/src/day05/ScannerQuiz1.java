package day05;

import java.util.Scanner;

public class ScannerQuiz1 {

	public static void main(String[] args) {
		/*
		 *  Scanner�� �̿��ؼ� double �ڷḦ 2�� �Է¹޾��ּ���.
		 *  �Է¹��� ������ double a, b; �� �����ؼ� ������ֽø� �˴ϴ�.
		 *  
		 *  �Է¹��� a,b ������ ���� ���� System.out.println()�� �̿��� ������ּ���.
		 *  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Ǽ� 1�� �Է��ϼ��� : ");
		double a = scan.nextDouble();

		System.out.println("�Ǽ� 2�� �Է��ϼ��� : ");
		double b = scan.nextDouble();
		
		System.out.println("�Է��� �Ǽ� 2���� �� : " + (a + b));
		
		scan.close();
		// scan.close()�� ���� ������, ��ǻ�Ͱ� ������.
		
	}

}
