package day04;

public class Array1 {

	public static void main(String[] args) {
		int[] arr;	// int arr[];
		// �迭�� ����, arr��� �̸��� int �ڷḦ ���� �� �����.
		
		arr = new int[5];
		// �迭�� ����, arr��� �̸��� int 5���� �����.
		
		// �� ������ �Ʒ��� ���� �� �ٷ� ǥ�� ����(���� �� ����) 
		// int[] arr = new int [5];
		
		arr[0] = 1; arr[1] = 2; arr[2] = 3;
		arr[3] = 4; arr[4] = 5;
		// �迭 ���ο� �ڷ� ����, ������ 0������ ����
		
		System.out.println("arr������ ù ��° ��� : " + arr[0] );
		System.out.println("arr������ ù ��° ��� : " + arr[1] );
		System.out.println("arr������ ù ��° ��� : " + arr[2] );
		System.out.println("arr������ ù ��° ��� : " + arr[3] );
		System.out.println("arr������ ù ��° ��� : " + arr[4] );
		// �ڷ� ��µ� ����� �ٸ��� ����.
		

	}

}
