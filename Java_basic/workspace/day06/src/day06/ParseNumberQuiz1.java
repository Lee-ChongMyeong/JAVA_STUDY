package day06;

import java.util.Scanner;

public class ParseNumberQuiz1 {
	public static void main(String[] args) {
		
		/*
		 * String�� ���� s1, s2�� �������ּ���.
		 * double�� ���� n1, n2�� �������ּ���.
		 * 
		 * Scanner�� �̿��ؼ� s1, s2��
		 * ���ڿ��� �Է¹ް�
		 * 
		 * �Է¹��� ���ڿ��� �Ǽ��� ��ȯ�ؼ� n1, n2�� �������ּ���.
		 * 
		 * ������ n1, n2��
		 * System.out.println()�� �̿��� ���� �����ּ���.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڸ� �Ǽ��� �Է����ּ��� : ");
		String s1 = sc.nextLine();
		System.out.println("ù ��° ���ڸ� �Ǽ��� �Է����ּ��� : ");
		String s2 = sc.nextLine();
		
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		
		System.out.println("�� ���� �� : " + (n1 + n2));
		
		sc.close();
	}
}