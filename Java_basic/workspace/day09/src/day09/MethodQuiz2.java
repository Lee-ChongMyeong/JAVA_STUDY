package day09;

public class MethodQuiz2 {
	
	public static double A(double num1, double num2){
		System.out.println("�Է°� : " + num1 + " �� " + num2);
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		
		/*
		 * ����2.
		 * 
		 * �̹����� �ڷ��� double�� �����ϴ� �޼��带 �����ڽ��ϴ�.
		 * 
		 * �Է¹޴� ���� double num1, double num2 �Դϴ�.
		 * 
		 * return ���� num1 + num2 �Դϴ�.
		 * 
		 * main ������ ���ο��� ���� ��뵵 �� ������.
		 */
		
		System.out.println(A(1.1, 2.2));
		// �Ǽ��� 2������ �ȶ������� ��찡 ����. �ٻ簪���� ���� ��찡 ����.
		// 3.300000000003 -> 2������ ��Ÿ������ �ٻ簪 / 2������ �� �������� ǥ�� �Ұ���.
	}
}
