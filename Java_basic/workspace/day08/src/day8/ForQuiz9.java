package day8;

import java.util.Scanner;

public class ForQuiz9 {
	public static void main(String[] args) {
		/*
		 * �Ʊ� 8���������� ®�� double ���� �ڵ带
		 * ���� for�� ������ �̿��ؼ� ����ϵ��� ���ĺ�����.
		 * 
		 * �Է��� ���� for�� ������� �����մϴ�.
		 */
		
		double arr[] = new double[4];
		Scanner sc = new Scanner(System.in);
		
		for (int i =0; i < arr.length; i++) {
			System.out.println("����" + (i+1) + "�� �Է��ϼ��� : ");
			arr[i] = sc.nextDouble();
		}
		
		for (double a : arr) {
			System.out.println(a);
		}
		
		sc.close();
		
		
	}
}
