package day8;

import java.util.Scanner;

public class ForQuiz8 {
	public static void main(String[] args) {
		
		/*
		 * ����8.
		 * double[] arr = new double[4];
		 * �� �̿��ؼ� double �迭 arr(����4)�� ������ּ���.
		 * 
		 * �� ���� for���� arr.length�� �̿��ؼ�
		 * double�� 0��° ~ 4��° ������ ��ҿ�
		 * ���� �Ǽ� ���ڸ� �Է¹޾ƺ�����.
		 * 
		 * �Է��� �� ������ for���� �̿��ؼ�
		 * �� �Է¹��� ���ڸ� ��ü������ ����غ�����.
		 */
		
		double arr[] = new double[4];
		Scanner sc = new Scanner(System.in);
		
		
		for (int i =0; i < arr.length; i++) {
			System.out.println("����" + (i+1) + "�� �Է��ϼ��� : ");
			arr[i] = sc.nextDouble();
			
		}
		
		for (int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
		
		sc.close();
		
		
		
	}
}
