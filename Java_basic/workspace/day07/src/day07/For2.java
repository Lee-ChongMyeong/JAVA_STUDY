package day07;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {		
		
		/*	
		 * ��������)
		 * Scanner�� �̿��ؼ� n�� �Է¹޾��� ��
		 * n�� ����� �ش��ϴ� �� ���� ����ϰ� ��������
		 * (*��Ʈ : % �����ڸ� Ȱ���մϴ�.)
		 * 
		 * 
		 * ex) n�� 3�Է½� -> 3��, 6��, 9�� ���
		 * n�� 4 �Է½� -> 4��, 8�� ���
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ����� ����Ͻðھ��? : ");
		int num = sc.nextInt();
		
		
		for (int i = num; i <= 9; i++) {
			if ( i % num == 0) {
				System.out.println(i + "�� ����� �����մϴ�. ");
				for(int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + (i * j));
					}
				System.out.println(i + "�� ����� ��Ĩ�ϴ�. ");
			}
			
		}
		sc.close();
		
		
	}
}
