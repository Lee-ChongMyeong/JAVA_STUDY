package day8;

public class ForQuiz6 {
	public static void main(String[] args) {
		/*
		 * ����6.
		 * 
		 * ���� 5�� ���� ����������
		 * ���� ������
		 * 
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 * �� ��ø �ݺ����� �ۼ����ּ���.
		 */
		
		for (int i =0; i < 5; i++) {
			for (int y=0; y < 5 - i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
