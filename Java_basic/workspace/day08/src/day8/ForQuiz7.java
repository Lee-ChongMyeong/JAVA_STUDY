package day8;

public class ForQuiz7 {
	public static void main(String[] args) {
		
		/*
		 * ����7
		 * 
		 * ������ ���� ������ ���� ������.
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****	
		 * 
		 * ��ø �ݺ����� ����մϴ�.
		 * 
		 */
		
		for (int i =0; i < 5; i++) {
			for (int y=0; y < 5 - i; y++) {
				System.out.print(" ");
			}
			for (int j =0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
