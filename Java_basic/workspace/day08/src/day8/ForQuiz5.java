package day8;

import java.util.Scanner;

public class ForQuiz5 {
	public static void main(String[] args) {
		
		/*
		 * ����5
		 * 
		 * ��ø �ݺ����� ����ؼ�
		 * �Ʒ��� ���� ���� ����ּ���.
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 */

		for (int i =0; i < 5; i++) {
			for (int y=0; y <= i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
