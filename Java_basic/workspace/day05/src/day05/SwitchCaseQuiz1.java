package day05;

import java.util.Scanner;

public class SwitchCaseQuiz1 {
	public static void main(String[] args) {
		
		/*
		 * Switch~case ���� Ȱ���� ���⸦ ����ڽ��ϴ�.
		 * int num1, num2; �� �������ּ���
		 * num1 �� num2 �� ��� ��ĳ�ʸ� �̿��� ������ �Է¹޽��ϴ�.
		 * 
		 * int option; �� �������ּ���.
		 * option ������ ��ĳ�ʸ� �̿��� ������ �Է¹޽��ϴ�.
		 * ������ �Է¹ޱ� ���� 1�� +, 2�� -, 3�� *, 4�� /, 5�� %
		 * ������ �ϰ� �ȴٴ� ����� 
		 * System.out.println()�� �̿��� �˷��ּ���.
		 * 
		 * ���� switch~case���� �ۼ����ֽõ�
		 * switch������ ������ option�� �־��ּ���.
		 * 
		 * ���� case���� option�� 1�̸�
		 * System.out.println()���� num1 + num2��
		 * option�� 2�̸�
		 * System.out.println()���� num1 - num2��
		 * option�� 3�̸�
		 * System.out.println()���� num1 * num2��
		 * option�� 4�̸�
		 * System.out.println()���� num1 / num2�� 
		 * option�� 5�̸�
		 * System.out.println()���� num1 % num2�� ������ּ���
		 * option�� ���� �̿��� ���ڶ��
		 * System.out.println()���� "���� �̿��� �ɼ��Դϴ�."
		 * �� ������ּ���
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int num2 = sc.nextInt();
		System.out.println("���� �ɼ��� �������ּ���.");
		System.out.println("1�� +, 2�� -, 3�� *, 4�� /, 5�� %");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("�� ���� �� : " + (num1 + num2));
			break;
		case 2:
			System.out.println("�� ���� �� : " + (num1 - num2));
			break;
		case 3:
			System.out.println("�� ���� �� : " + (num1 * num2));
			break;	
		case 4:
			System.out.println("�� ���� ������ : " + (num1 / num2));
			break;	
		case 5:
			System.out.println("�� ���� ������ : " + (num1 % num2));
			break;
		default:
			System.out.println("���� �̿��� �ɼ��Դϴ�. ");
			break;
			
		}
		sc.close();
	}
}
