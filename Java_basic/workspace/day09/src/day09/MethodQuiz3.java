package day09;

import java.util.Scanner;

public class MethodQuiz3 {
	
	public static void CtoF(double celcius){
		
		double fahrenheit = (celcius * 1.8) + 32;
		System.out.println("������ ���� �µ��� : " + celcius);
		System.out.println("������ ȭ�� �µ��� : " + fahrenheit);
	}
	
	public static void main(String[] args) {
		/*����3
		 * 
		 * ���� �ڷ����� void�� �޼��� CtoF�� �ۼ��ϰڽ��ϴ�.
		 * 
		 * CtoF�� double celcius �� �Է¹޽��ϴ�.
		 * 
		 * �� �ڷ�� ���� �µ��� �ǹ��մϴ�.
		 * 
		 * �����µ��� �Է����� �� ȭ���µ��� ��ȯ�ؼ� �ܼ�â�� ����ϴ� ���α׷���
		 * �ۼ����ֽø� �˴Ѵ�.
		 * 
		 * ȭ�� -> ���� ��ȯ ������ 
		 * �����µ� = (ȭ���µ� -32) / 1.8
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �µ��� �Է��ϼ��� : ");
		double celcius = sc.nextDouble();
		CtoF(celcius);
		
				
		
		
		
		
		
	}
}
