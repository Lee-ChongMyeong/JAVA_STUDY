package day05;

import java.util.Scanner;

public class ifBasicQuiz2 {
	public static void main(String[] args) {
		
		/*
		 * �������� ���α׷� �� ��° �Դϴ�.
		 * double score; ������ ��ĳ�ʸ� �̿��ؼ� ������ �Է����ּ���.
		 * 
		 * �Է¹��� ������ if~else if~else �������� ó���ؾ� �ϸ�
		 * 100�� ���� 90�� �̻��� "A�Դϴ�." ��� ������
		 * 90�� �̸� 80�� �̻��� "B�Դϴ�." ��� ������
		 * 80�� �̸� 70�� �̻��� "C�Դϴ�." ��� ������
		 * 70�� �̸� 60�� �̻��� "D�Դϴ�." ��� ������
		 * 60�� �̸��� "F�Դϴ�." ��� ������ �ܼ�â�� ����ֽø� �˴ϴ�.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		double score = sc.nextDouble();
		
		if (100>= score && score >= 90) {
			System.out.println("A�Դϴ�.");
		}else if (score <90 && score >= 80) {
			System.out.println("B�Դϴ�.");
		}else if (score <80 && score >= 70) {
			System.out.println("C�Դϴ�.");
		}else if (score <70 && score >= 60) {
			System.out.println("D�Դϴ�.");
		}else if (score > 100 || score < 0) {
			System.out.println("�߸��� ������ ���� �Է��ϼ̽��ϴ�.");
		}else {
			System.out.println("F�Դϴ�.");
		}
		
		sc.close();
		
	
	}
}
