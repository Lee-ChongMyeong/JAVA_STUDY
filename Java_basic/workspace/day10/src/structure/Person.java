package structure;

public class Person {
	
	
	/*
	 * ����2.
	 * 
	 * �ַ����� �޼����� buyliquor() �� �ۼ����ּ���.
	 * 
	 * ��, age�� 19�� �̻��̸�
	 * 
	 * System.out.println("�ַ��� �����߽��ϴ�.");
	 * �� ����ϰ�
	 * 
	 * �� �̸��̸�
	 * System.out.println("�̼����ڴ� �ַ��� ������ �� �����ϴ�.");
	 * �� ��µǵ��� �޼��� ���ο� if~else���� �ۼ����ּ���.
	 */
	
	public String name;
	public String phoneNum;
	public int age;
	
	public void show() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + phoneNum);
		System.out.println("���� : " + age);
	}
	
	public void buyliquor() {
		if (age >= 19) {
			System.out.println(name + "��(��) �ַ��� �����߽��ϴ�.");
		}else {
			System.out.println("�̼����ڴ� �ַ��� ������ �� �����ϴ�.");
		}
	}
	
}

