package day06;

import java.util.Scanner;

public class DoWhileQuiz1 {
	public static void main(String[] args) {
		
		/*
		 * �������� �ſ�ī�� ���α׷��� ��������ϴ�.
		 * �� �ſ�ī��� ���������� 50���� �̻��̸� �����޿�
		 * ������ �ְ� �׷��� ������ ������ ��������ϴ�.
		 * 
		 * do~while���� �̿��ؼ� ������ �� ��°�� ����������
		 * Ȯ���� �� �ִ� ���α׷��� ������ּ���.
		 * 
		 * ��뺯�� - int output, month;
		 * ���� output�� ����ڰ� ��ĳ�ʸ� �̿��ؼ�
		 * ���� ���� �Ź� �Է��ϰ� ������ݴϴ�.
		 * 
		 * month������ while���� �� ���� �������� 1�� �����մϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int output = 0;
		int month = 0;
		
		do {
			month++;
			System.out.println("���� ���� �� : " + month);
			System.out.println("���� ���� : " + output + "����");
			System.out.println("============================");
			System.out.println("�̹��� ������ �Է����ּ���.");
			output = sc.nextInt();
		}while(output >= 50);
		
		System.out.println("�������� �������� " + month + "����°�Դϴ�.");
		System.out.println("����" + output + "�������� ������� �Ǿ����ϴ�.");
		
	}
}
