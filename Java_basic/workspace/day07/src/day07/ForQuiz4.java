package day07;

import java.util.Scanner;

public class ForQuiz4 {
	public static void main(String[] args) {
		
		
		/*
		 * ����4)
		 * ����⸦ �ϰڽ��ϴ�.
		 * 
		 * �ݺ����� �̿��ؼ� ****** �� �ܼ�â�� ������ּ���.
		 * 
		 * �ݺ����� �ݺ�Ƚ���� 5ȸ �Դϴ�.
		 * 
		 * ����1)
		 * 5���� �ƴ϶� ����ڰ� �Է��� Ƚ����ŭ ����ϰ� �ٲ��ּ���.
		 * 
		 * ����2)
		 * x * x �� ���簢���� ȭ�鿡 ����ϵ��� ������ּ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��� �ݺ��ϰڽ��ϱ�?");
		int num = sc.nextInt();
		
		for(int i =0; i<num; i++) {
			for(int y = 0; y<num; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
