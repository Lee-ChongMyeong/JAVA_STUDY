package day09;

import java.util.Scanner;

public class MethodQuiz4 {
	
	/*����4.
	 * BMI ������ ���ϴ� �����Դϴ�.
	 * 
	 * BMI ������ ���ϴ� ������ (ü�� / ����(m) * ����(m)) �Դϴ�.
	 * 
	 * ����(m)�� �ǹ̴� 175cm -> 1.75m�� ��ȯ�ؾ� �Ѵٴ� �ǹ��Դϴ�.
	 * 
	 * public static�� �޼��� BMI�� ������ּ���. �Է��ڷ�� �����ϴ�.
	 * 
	 * ��� �޼��� ���ο��� ��ĳ�ʸ� �̿��ؼ�
	 * ü���� double weight, ������ double height �ʱ�ȭ ��ŵ�ϴ�.
	 * 
	 * �� ���� ���� ������ �̿��ؼ� double result ������ ������� ������ ����
	 * return result�� ���� �������ֽø� �˴ϴ�.
	 */
	
	
	public static double BMI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("ü���� �Է��ϼ���(kg) : ");
		double weight = sc.nextDouble();
	
		double result = weight / ((height * 0.01)  * (height  * 0.01));	
		return result;
	}
	
	public static void main(String[] args) {
	
		double yourBmi = BMI();
		//System.out.println("����� BMI������ " + yourBmi + "�Դϴ�.");
		System.out.format("����� BMI������ %.2f �Դϴ�. %n",  yourBmi);
	
	}
}
