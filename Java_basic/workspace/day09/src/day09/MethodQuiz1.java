package day09;

public class MethodQuiz1 {
	
	public static int Plus(int a, int b, int c){
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		/*
		 * main �޼��� �̿ܿ� �ٸ� �޼��带 �ϳ� �� �ۼ��غ��ڽ��ϴ�.
		 * 
		 * public static�� ����ϰ� int �� �ڷḦ return �մϴ�.
		 * 
		 * �޼��� �̸��� Plus�� �ϰڽ��ϴ�.
		 * 
		 * �� �޼���� (int a, int b, int c)�� �Է¹ް�
		 * 
		 * a + b + c�� �����մϴ�.
		 * 
		 * main������ ���ο��� Plus�� ȣ���ϴ� �κб��� �Բ� �ۼ��غ�����.
		 * 
		 * 
		 */
		int result = Plus(3,6,8);
		System.out.println(result);
		
		result = Plus(10,20,30);
		System.out.println(result);
		
		
		
	}
}
