package day07;

public class ForQuiz3 {
	public static void main(String[] args) {
		
		/*
		 * ����3.
		 * ������ 4x + 5y = 60�� ������
		 * 
		 * x�� y�� �ڿ��� �ظ� ���ؼ� ����غ�����.
		 * 
		 * ��Ʈ1. ��ø for���� ����մϴ�.
		 * �ϳ��� for���� x�� �ظ� ����ϰ�
		 * �ϳ��� for���� y�� �ظ� ����մϴ�.
		 * 
		 * ��Ʈ2.
		 * ��ø for�� ������ if���� Ȱ���ؼ� �ذ� �´��� �ƴ��� �����մϴ�.
		 */
		
		for(int x = 1; x < 20; x ++) {
			for(int y = 1; y < 20; y++) {
				if ((4 * x + 5 * y) == 60) {
					System.out.println("x�� �� : " + x);
					System.out.println("y�� �� : " + y);
					System.out.println("=======================");
				}
			}
		}
		
		
	}
}
