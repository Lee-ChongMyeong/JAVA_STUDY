package day8;

public class ExitQuiz1 {
	public static void main(String[] args) {
		
		/*
		 * ����1.
		 * int arr[] = new int[100]; �� �̿��ؼ�
		 * ũ�� 100¥�� �迭�� ������ּ���.
		 * 
		 * for���� �̿��ؼ� arr[0] = 0, arr[1] = 10 .. �� ����
		 * arr[99] = 990; �� ���Եǵ��� ���ּ���.
		 * 
		 * �׸��� ����� ���� 4�� ����� ������ ���������� ��µǰ� �� �ֽð�
		 * ��¹����� 0~770 ���̷� �� �ּ���.
		 */
		
		int arr[] = new int[100];
		
		for (int i =0; i < 100; i++) {
			arr[i] = i * 10;
		}
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] % 4 ==0 && arr[i] != 0) {
				continue;
			}
			if (arr[i] >= 770) {
				break;
			}
			System.out.println(arr[i]);
			
		}
		
		
		
	}
}
