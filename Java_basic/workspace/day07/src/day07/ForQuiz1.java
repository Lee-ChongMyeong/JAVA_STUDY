package day07;

import java.util.Scanner;

public class ForQuiz1 {
	public static void main(String[] args) {
		/*
		 * 
		 * ����1.
		 * ��ĳ�ʸ� �̿��ؼ� int ���� �ϳ��� ������������.
		 * 
		 * �׸��� �������� ���� Ƚ����ŭ
		 * 
		 * "Hello World" ��� ������ �����ϵ���
		 * 
		 * for ���� �ۼ����ּ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("�ݺ�Ƚ�� ��ŭ ���ڸ� �Է��ϼ��� :");
		num = sc.nextInt();
		
		for(int i= num; i > 0; i--) {
			System.out.println("Hello world" + i);
		}
		
		sc.close();
		
	}
}
