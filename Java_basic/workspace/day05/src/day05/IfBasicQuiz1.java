package day05;

import java.util.Scanner;

public class IfBasicQuiz1 {
	public static void main(String[] args) {
		
		/*
		 *  Pass / Fail ä�� ���α׷��� ������ּ���.
		 *  
		 *  double score; �� ������ ���� ��ĳ�ʷ� ������
		 *  �Է¹޾� ������.
		 *  
		 *  �Է¹��� ������ 60.0 �̻��̸� if ���� �̿��ؼ�
		 *  "����� ������ x���Դϴ�. ���迡 ����ϼ̽��ϴ�."
		 *  ��� ����Ͻð�
		 *  
		 *  �Է¹��� ������ 60.0 �̸��̸� else ���� �̿��ؼ�
		 *  "����� ������ x���Դϴ�. ���� ���迡 �������ּ���."
		 *  ��� ������ֽø� �˴ϴ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		double score = scan.nextDouble();
		
		
		
		if (score >= 60.0) {
			System.out.println("����� ������" + score + "���Դϴ�. ���迡 ����ϼ̽��ϴ�.");
		}else {
			System.out.println("����� ������" + score + "���Դϴ�. ���� ���迡 �������ּ���.");
		}
		
		scan.close();
	}
}
