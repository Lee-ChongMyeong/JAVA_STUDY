package day07;

import java.util.Scanner;

public class ForQuiz2 {
	public static void main(String[] args) {
		/*
		 * ����2)
		 * ��ĳ�ʸ� �̿��� ������ �ϳ� �Է¹�������.
		 * 
		 * �Է¹��� ������ �ش��ϴ� �������� ����ϴ� �ڵ带
		 * 
		 * �ݺ����� �̿��� �ۼ����ּ���.
		 * 
		 * 
		 * ��������)
		 * num �� ���� ���� 2~9�� ������ �״�� ���,
		 * �׷��� 2�̸� 9�ʰ��� ������ �´� ���ڸ� �Է����ּ���. ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �� ���� ����Ͻó���?");
		int num = sc.nextInt();
		
		if (num < 2 || num > 9) {
			System.out.println("������ �´� ���ڸ� �Է����ּ���");
		}else {
			System.out.println(num + "�� ����� �մϴ�.");
			for (int i = 1; i <=9; i++) {
				System.out.println(num + "X" + i + "=" + (num * i));
			}
			
			System.out.println(num + "�� ��¿Ϸ�!!");
		}
		sc.close();
	}
}
