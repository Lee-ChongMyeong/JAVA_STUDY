package day04;

public class ArrayQuiz1 {

	public static void main(String[] args) {
		/*
		 *  �迭 ������ ���� �� �ּ���.
		 *  �迭 arr1�� arr2�� ����� �ֽõ�
		 *  arr1�� ����, ����, �ʱ�ȭ�� �и����ּ���
		 *  arr2�� ����, ����, �ʱ�ȭ�� ���ٷ� ó�����ּ���.
		 *  
		 *  arr1, arr2�� �ڷ����� double�Դϴ�.
		 *  arr2�� �� �ٷ� ó���� �� 1.1 2.2 3.3 4.4 5.5
		 *  ������ 5���� �ڷḦ �־��ֽð�
		 *  
		 *  arr1�� ���� �ڷḦ � ������ �������ּ���.
		 *  arr1�� arr1.length�� ���� ��� ������ �������ּ���.
		 *  arr2�� ���ο�Ҹ� �ϳ��� System.out.println���� 
		 *  � ��Ұ� ����Ǿ� �ִ��� �ܼ�â�� ������ּ���.
		 */
		
		double arr1 [];
		arr1 = new double [4];
		arr1[0] = 1.1;
		arr1[1] = 2.2;
		arr1[2] = 3.3;
		arr1[3] = 4.4;
		
		double arr2 [] = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		System.out.println("arr1�� ��� ���� " + arr1.length);
		System.out.println();
		
		System.out.println("arr2�� ��� : " + arr2[0]);
		System.out.println("arr2�� ��� : " + arr2[1]);
		System.out.println("arr2�� ��� : " + arr2[2]);
		System.out.println("arr2�� ��� : " + arr2[3]);
		System.out.println("arr2�� ��� : " + arr2[4]);
		
	}
}
