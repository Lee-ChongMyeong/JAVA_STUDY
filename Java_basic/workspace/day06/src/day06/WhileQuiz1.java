package day06;

import java.util.Scanner;

public class WhileQuiz1 {
	public static void main(String[] args) {
		/*
		 * while���� Scanner�� �̿��ؼ�
		 * ���ϴ� Ƚ����ŭ
		 * 
		 * "Hello Java!" ��� ������ �ݺ��ؼ�
		 * ����ϴ� ������ �ۼ��غ��ڽ��ϴ�.
		 * 
		 * Scannner�� �̿��ؼ� int�ڷḦ �Է¹ް�
		 * 
		 * �� Ƚ����ŭ Hello Java! ��� ������
		 * �ܼ�â�� ����ϴ� ������ �ۼ����ּ���.
		 */
		
		int num, count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ϴ� Ƚ����ŭ �ݺ���ų ���� �Է��ϼ��� : ");
		num = sc.nextInt();
		
		
		while(count < num) {
			System.out.println("Hello Java!");
			count++;
		}
		sc.close();
	}
}